package com.kiet.tasktracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiet.tasktracker.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByCompleted(boolean completed);
}
