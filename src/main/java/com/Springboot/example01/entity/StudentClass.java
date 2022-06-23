package com.Springboot.example01.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentClass {
	@Id
	private int id;
	private String name;
	private int marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public StudentClass(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public StudentClass() {
		super();
	}
	
	System.out.println("i did changes");


}
