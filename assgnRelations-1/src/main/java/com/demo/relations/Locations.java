package com.demo.relations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="loc_table")
public class Locations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@JsonManagedReference
	//@JoinColumn(name="lid_fk")
	@OneToMany(mappedBy = "loc",cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	
	private List<Users> users=new ArrayList<>();


	public Locations() {}


	public Locations(String name) {
	
		this.name = name;
	}


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


	public List<Users> getUsers() {
		return users;
	}


	public void setUsers(List<Users> users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "Locations [id=" + id + ", name=" + name + "]";
	} 
	
	
	
	
}
