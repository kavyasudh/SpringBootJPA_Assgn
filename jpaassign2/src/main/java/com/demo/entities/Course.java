package com.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.*;
@Entity
@Table(name="course_table")
public class Course {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cId;
	private String cName;
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn
	private List<Student> stud=new ArrayList<>();
	public Course(String cName) {
		this.cName = cName;
	}
	public Course() {
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<Student> getStud() {
		return stud;
	}
	public void setStud(List<Student> stud) {
		this.stud = stud;
	}
	
	
	
}
