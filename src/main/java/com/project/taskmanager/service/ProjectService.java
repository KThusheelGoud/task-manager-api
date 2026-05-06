package com.project.taskmanager.service;

import com.project.taskmanager.model.Project;
import com.project.taskmanager.model.User;
import com.project.taskmanager.repository.ProjectRepository;
import com.project.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    public Project createProject(Project project, String username) {
        // Link the project to the Admin who created it
        User owner = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Error: User not found."));
        project.setOwner(owner);
        return projectRepository.save(project);
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}