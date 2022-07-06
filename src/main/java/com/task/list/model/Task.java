package com.task.list.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaskList implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String dateStart;
	private String dateFinish;
	private String description;
	private boolean finished;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateStart() {
		return dateStart;
	}
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	public String getDateFinish() {
		return dateFinish;
	}
	public void setDateFinish(String dateFinish) {
		this.dateFinish = dateFinish;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	@Override
	public String toString() {
		return "TaskList [id=" + id + ", name=" + name + ", dateStart=" + dateStart + ", dateFinish=" + dateFinish
				+ ", Description=" + description + ", finished=" + finished + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, dateFinish, dateStart, finished, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskList other = (TaskList) obj;
		return Objects.equals(description, other.description) && Objects.equals(dateFinish, other.dateFinish)
				&& Objects.equals(dateStart, other.dateStart) && finished == other.finished
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
}
