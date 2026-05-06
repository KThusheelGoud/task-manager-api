package com.project.taskmanager.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String password;
    private String role; // "admin" or "member"
}