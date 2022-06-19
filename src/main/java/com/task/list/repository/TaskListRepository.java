package com.task.list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.list.model.TaskList;

public interface TaskListRepository extends JpaRepository<TaskList, Long>{

}
