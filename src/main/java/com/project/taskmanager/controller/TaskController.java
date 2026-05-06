package com.project.taskmanager.controller;

import com.project.taskmanager.model.Task;
import com.project.taskmanager.model.TaskStatus;
import com.project.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
// @CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Requirement: Admin creates and assigns tasks
    @PostMapping("/project/{projectId}/assign/{userId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Task> createTask(@PathVariable Long projectId, 
                                           @PathVariable Long userId, 
                                           @RequestBody Task task) {
        return ResponseEntity.ok(taskService.createTask(projectId, userId, task));
    }

    // Requirement: Users track progress (Update Status)
    @PatchMapping("/{taskId}/status")
    @PreAuthorize("hasAnyRole('ADMIN', 'MEMBER')")
    public ResponseEntity<Task> updateTaskStatus(@PathVariable Long taskId, 
                                                 @RequestParam TaskStatus status) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(taskService.updateStatus(taskId, status, userDetails.getUsername()));
    }

    // Requirement: Dashboard (tasks, status, overdue)
    @GetMapping("/dashboard")
    @PreAuthorize("hasAnyRole('ADMIN', 'MEMBER')")
    public ResponseEntity<Map<String, Object>> getDashboard() {
        return ResponseEntity.ok(taskService.getDashboardStats());
    }
}