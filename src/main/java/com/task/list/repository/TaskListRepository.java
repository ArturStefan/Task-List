package com.task.list.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.list.model.Task;

public interface TaskListRepository extends JpaRepository<Task, UUID>{

}
