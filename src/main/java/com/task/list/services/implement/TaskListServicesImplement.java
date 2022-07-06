package com.task.list.services.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.task.list.dto.TaskDTO;
import com.task.list.model.Task;
import com.task.list.repository.TaskListRepository;
import com.task.list.services.TaskListServices;

@Component
public class TaskListServicesImplement implements TaskListServices {

	private Task task;

	@Autowired
	TaskListRepository repository;

	@Override
	public List<TaskDTO> findAll() {
		List<Task> listTasks = repository.findAll();
		List<TaskDTO> listTaskDTO = new ArrayList<>();
		
		listTasks.forEach(
				task -> {
					listTaskDTO.add(new TaskDTO().transformModelToDTO(task));
				}
		);
		
		return listTaskDTO;
	}

	@Override
	public Task findById(UUID id) {
		return repository.findById(id).orElse(new Task());
	}

	@Override
	public ResponseEntity<Task> create(TaskDTO taskDTO) {
		task = new Task();
		task.transformDTOtoModel(taskDTO);
		repository.save(task);
		return new ResponseEntity<Task>(HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Task> update(Task task) {
		Task entity = repository.findById(task.getId()).orElse(new Task());
		if (entity.getId() == null) {
			return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
		} else {
			entity.setId(task.getId());
			entity.setName(task.getName());
			entity.setDateStart(task.getDateStart());
			entity.setDateFinish(task.getDateFinish());
			entity.setDescription(task.getDescription());
			entity.setFinished(task.isFinished());

			return new ResponseEntity<Task>(repository.save(entity),HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseEntity<Task> delete(UUID id) {
		repository.deleteById(id);
		return new ResponseEntity<Task>(HttpStatus.NO_CONTENT);
	}
}
