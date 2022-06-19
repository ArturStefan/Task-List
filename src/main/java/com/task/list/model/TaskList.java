package com.task.list.model;

import java.util.Date;
import java.util.Objects;

public class TaskList {

	private Long id;
	private String name;
	private Date dateStart;
	private Date dateFinish;
	private String Description;
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
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public Date getDateFinish() {
		return dateFinish;
	}
	public void setDateFinish(Date dateFinish) {
		this.dateFinish = dateFinish;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
				+ ", Description=" + Description + ", finished=" + finished + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Description, dateFinish, dateStart, finished, id, name);
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
		return Objects.equals(Description, other.Description) && Objects.equals(dateFinish, other.dateFinish)
				&& Objects.equals(dateStart, other.dateStart) && finished == other.finished
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
}
