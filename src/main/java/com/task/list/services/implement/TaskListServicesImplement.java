package com.task.list.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.task.list.model.TaskList;
import com.task.list.repository.TaskListRepository;
import com.task.list.services.TaskListServices;

@Component
public class TaskListServicesImplement implements TaskListServices{
	
	@Autowired
	TaskListRepository repository;
	
	@Override
	public List<TaskList> findAll() {
		return repository.findAll();
	}
	
	@Override
	public TaskList findById(Long id) {
		return repository.findById(id).orElse(new TaskList());
	}

	@Override
	public TaskList create(TaskList taskList) {
		return repository.save(taskList);
	}

	@Override
	public TaskList update(TaskList taskList) {
		return repository.save(taskList);
	}
}
