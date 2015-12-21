package models;

import java.io.Serializable;

import play.db.jpa.Model;

public class IssueStatus extends Model implements Serializable{
	
	private Long id;
	private String name;
	private boolean is_closed;
	private boolean is_default;
	private Integer position;
	private Integer default_done_ratio;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public boolean isIs_closed() {
		return is_closed;
	}
	public boolean isIs_default() {
		return is_default;
	}
	public Integer getPosition() {
		return position;
	}
	public Integer getDefault_done_ratio() {
		return default_done_ratio;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIs_closed(boolean is_closed) {
		this.is_closed = is_closed;
	}
	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public void setDefault_done_ratio(Integer default_done_ratio) {
		this.default_done_ratio = default_done_ratio;
	}

}
