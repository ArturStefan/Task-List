package com.task.list.dto;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.task.list.model.Task;

public class TaskDTO {

	private UUID id;
	private String name;
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy", locale="pt-BR", timezone="Brazil/East" )
	private Date dateFinish;
	private String description;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateFinish() {
		return dateFinish;
	}

	public void setDateFinish(Date dateFinish) {
		this.dateFinish = dateFinish;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TaskDTO [id=" + id + ", name=" + name + ", dateFinish=" + dateFinish + ", description=" + description
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateFinish, description, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskDTO other = (TaskDTO) obj;
		return Objects.equals(dateFinish, other.dateFinish) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	public TaskDTO transformModelToDTO(Task task) {
		TaskDTO taskDTO = new TaskDTO();
		
		taskDTO.id = task.getId();
		taskDTO.name = task.getName();
		taskDTO.dateFinish = task.getDateFinish();
		taskDTO.description = task.getDescription();
		
		return taskDTO;
	}
}
