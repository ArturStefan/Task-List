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
	TaskListRepository taskListRepository;
	
	@Override
	public List<TaskList> findAll() {
		return taskListRepository.findAll();
	}

}
