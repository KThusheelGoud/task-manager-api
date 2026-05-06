package com.project.taskmanager.repository;

import com.project.taskmanager.model.Task;
import com.project.taskmanager.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
    // For the Dashboard: Count tasks by their status (TODO, DONE)
    long countByStatus(TaskStatus status);
    
    // For the Dashboard: Custom query to count overdue tasks
    @Query("SELECT COUNT(t) FROM Task t WHERE t.status != 'DONE' AND t.dueDate < CURRENT_DATE")
    long countOverdueTasks();
}