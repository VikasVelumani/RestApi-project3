package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class Modelapi {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
     private int id;
     private String name;
     private String dept;
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
	public Modelapi(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;	
		this.dept = dept;
	}
	public Modelapi() {
		super();
		// TODO Auto-generated constructor stub
	}


}
