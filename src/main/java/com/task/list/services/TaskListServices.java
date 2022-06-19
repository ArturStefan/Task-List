package com.task.list.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.task.list.model.TaskList;

@Service
public interface TaskListServices {
	public List<TaskList> findAll();
}
