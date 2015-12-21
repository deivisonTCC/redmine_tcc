package models;

import java.io.Serializable;
import java.util.Date;

import play.db.jpa.Model;

public class Issues extends Model implements Serializable {
	
	private Long id;
	
	private Integer tracker_id;
	
	private Integer project_id;
	
	private String subject;
	
	private String summary;
	
	private String description;
	
	private Date due_date;
	
	private Integer category_id;
	
	private Integer status_id;
	
	private Integer assigned_to_id;
	
	private Integer priority_id;
		

	public Long getId() {
		return id;
	}

	public Integer getTracker_id() {
		return tracker_id;
	}

	public Integer getProject_id() {
		return project_id;
	}

	public String getSubject() {
		return subject;
	}

	public String getDescription() {
		return description;
	}

	public Date getDue_date() {
		return due_date;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public Integer getStatus_id() {
		return status_id;
	}

	public Integer getAssigned_to_id() {
		return assigned_to_id;
	}

	public Integer getPriority_id() {
		return priority_id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTracker_id(Integer tracker_id) {
		this.tracker_id = tracker_id;
	}

	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}

	public void setAssigned_to_id(Integer assigned_to_id) {
		this.assigned_to_id = assigned_to_id;
	}

	public void setPriority_id(Integer priority_id) {
		this.priority_id = priority_id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}
