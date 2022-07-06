package com.task.list.services;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.task.list.dto.TaskDTO;
import com.task.list.model.Task;

@Service
public interface TaskListServices {
	public List<TaskDTO> findAll();
	
	public Task findById(UUID id);
	
	public ResponseEntity<Task> create(TaskDTO taskDTO);
	
	public ResponseEntity<Task> update(Task taskList);
	
	public ResponseEntity<Task> delete(UUID id);
}