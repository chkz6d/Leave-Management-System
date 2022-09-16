//package com.leavemanagment.app.model;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "employee_details")
//public class Details {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
//	
//	@Column(name = "type")
//	private String type;
//	@Column(name = "reason")
//	private String reason;
//	
//	
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "details")
//	private Employee employee;
//	public Details() {
//		
//	}
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public String getReason() {
//		return reason;
//	}
//	public void setReason(String reason) {
//		this.reason = reason;
//	}
//	public Details(long id, String type, String reason) {
//		super();
//		this.type = type;
//		this.reason = reason;
//	}
//	
//	
//	public Employee getEmployee() {
//		return employee;
//	}
//	
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//}
