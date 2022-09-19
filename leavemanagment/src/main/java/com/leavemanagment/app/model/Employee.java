package com.leavemanagment.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "manager_id")
	private Integer managerId;
	
	@Column(name = "leave_count")
	private Integer leave_count;

	public Employee() {}
	

	public Employee(String name, Integer managerId, Integer leave_count) {
		super();
		this.name = name;
		this.managerId = managerId;
		this.leave_count = leave_count;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getLeave() {
		return leave_count;
	}
	public void setLeave(Integer leave_count) {
		this.leave_count = leave_count;
	}
	
}
