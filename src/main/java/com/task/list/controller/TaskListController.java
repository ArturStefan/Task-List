package com.task.list.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.list.model.TaskList;
import com.task.list.services.TaskListServices;

@RestController
@RequestMapping("/task-list")
public class TaskListController {
	
	@Autowired
	TaskListServices taskListServices;
	
	@GetMapping
	public List<TaskList> findAll(){
		return taskListServices.findAll(); 
	}
}
