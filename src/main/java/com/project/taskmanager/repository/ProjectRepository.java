package com.project.taskmanager.repository;

import com.project.taskmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // JpaRepository gives us everything we need for Projects automatically!
}