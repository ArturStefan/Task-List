package com.task.list.services.implement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.task.list.model.TaskList;
import com.task.list.services.TaskListServices;

@Component
public class TaskListServicesImplement implements TaskListServices{

	@Override
	public List<TaskList> findAll() {
		List<TaskList> tasks = new ArrayList<>();
		TaskList task1 = new TaskList();
		TaskList task2 = new TaskList();
		
		task1.setDateFinish(new Date());
		task1.setDateStart(new Date());
		task1.setDescription("Exemplo 1");
		task1.setFinished(false);
		task1.setId(1L);
		task1.setName("Task 1");
		
		task2.setDateFinish(new Date());
		task2.setDateStart(new Date());
		task2.setDescription("Exemplo 2");
		task2.setFinished(true);
		task2.setId(2L);
		task2.setName("Task 2");
		
		tasks.add(task1);
		tasks.add(task2);
		
		return tasks;
	}

}
