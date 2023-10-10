package com.example.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	public Employee() {
		super();
	}
	@Id
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	String name;
	public Employee(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	String dept;
}
