package com.io.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Department")
@SequenceGenerator(name="dpt", sequenceName="dpt_seq" ,initialValue=100)
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;	
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="dpt")
	@Column(name="dptId")
	private int departmentId;
	
	@Column(name="dptName")
	private String departmentName;
	
	
	public Department() {
	}
	
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
	

}
