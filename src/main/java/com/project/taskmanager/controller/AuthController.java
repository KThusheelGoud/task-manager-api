package com.project.taskmanager.controller;

import com.project.taskmanager.dto.*;
import com.project.taskmanager.model.Role;
import com.project.taskmanager.model.User;
import com.project.taskmanager.repository.UserRepository;
import com.project.taskmanager.security.JwtUtils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);
        
        org.springframework.security.core.userdetails.User userDetails = 
            (org.springframework.security.core.userdetails.User) authentication.getPrincipal();    
        
        // Find user to get their role for the response
        User user = userRepository.findByUsername(userDetails.getUsername()).get();

        return ResponseEntity.ok(new JwtResponse(jwt, 
                                 userDetails.getUsername(), 
                                 user.getRole().name()));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return ResponseEntity.badRequest().body("Error: Username is already taken!");
        }

        // Create new user's account
        User user = new User();
        user.setUsername(signUpRequest.getUsername());
        user.setPassword(encoder.encode(signUpRequest.getPassword()));
        
        // Set role based on input, default to MEMBER
        if (signUpRequest.getRole() != null && signUpRequest.getRole().equalsIgnoreCase("admin")) {
            user.setRole(Role.ROLE_ADMIN);
        } else {
            user.setRole(Role.ROLE_MEMBER);
        }

        userRepository.save(user);

        return ResponseEntity.ok("User registered successfully!");
    }
}