package com.task.list.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.list.dto.TaskDTO;
import com.task.list.model.Task;
import com.task.list.services.TaskListServices;

@RestController
@RequestMapping("/task-list")
public class TaskListController {
	
	@Autowired
	TaskListServices services;
	
	@GetMapping
	public ResponseEntity<List<TaskDTO>> findAll(){
		return ResponseEntity.ok(services.findAll()); 
	}
	
	@GetMapping("/{id}")
	public Task findById(@PathVariable("id") UUID id) {
		return services.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Task> create(@RequestBody TaskDTO taskDTO) {
		return services.create(taskDTO);
	}
	
	@PutMapping
	public ResponseEntity<Task> update(@RequestBody Task task) {
		return services.update(task);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Task> delete(@PathVariable("id") UUID id) {
		return services.delete(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Task> updateFinished(@PathVariable("id") UUID id){
		return services.updateFinished(id);
	}
}
