package com.project.taskmanager.service;

import com.project.taskmanager.model.*;
import com.project.taskmanager.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    public Task createTask(Long projectId, Long assigneeId, Task task) {
        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found"));
        User assignee = userRepository.findById(assigneeId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        task.setProject(project);
        task.setAssignedTo(assignee);

        if (task.getStatus() == null) {
            task.setStatus(TaskStatus.TODO);
        }

        return taskRepository.save(task);
    }

    public Task updateStatus(Long taskId, TaskStatus status, String currentUsername) {
        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        User currentUser = userRepository.findByUsername(currentUsername).get();

        // RBAC logic: Admins can update any task. Members can only update tasks assigned to THEM.
        if (currentUser.getRole() != Role.ROLE_ADMIN && !task.getAssignedTo().getUsername().equals(currentUsername)) {
            throw new RuntimeException("Access Denied: You can only update tasks assigned to you.");
        }

        task.setStatus(status);
        return taskRepository.save(task);
    }

    public Map<String, Object> getDashboardStats() {
        Map<String, Object> stats = new HashMap<>();
        stats.put("totalTasks", taskRepository.count());
        stats.put("todo", taskRepository.countByStatus(TaskStatus.TODO));
        stats.put("inProgress", taskRepository.countByStatus(TaskStatus.IN_PROGRESS));
        stats.put("done", taskRepository.countByStatus(TaskStatus.DONE));
        stats.put("overdue", taskRepository.countOverdueTasks());
        return stats;
    }
}