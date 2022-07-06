package com.task.list.dto;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.task.list.model.Task;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TaskDTO {

	private UUID id;
	private String name;
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
	private Date dateFinish;
	private String description;

	public TaskDTO transformModelToDTO(Task task) {
		TaskDTO taskDTO = new TaskDTO();

		taskDTO.id = task.getId();
		taskDTO.name = task.getName();
		taskDTO.dateFinish = task.getDateFinish();
		taskDTO.description = task.getDescription();

		return taskDTO;
	}
}
