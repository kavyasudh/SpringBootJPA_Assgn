package com.demo.relations;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="users_table")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String fname;
	private String lname;
	
	@JsonBackReference
	@JoinColumn(name="Lid_fk")
	@ManyToOne(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	private Locations loc;
	
	/*
	 * @OneToMany(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER) private
	 * List<Posts> posts=new ArrayList<>();
	 */
	private String email;

	public Users() {}

	
	public Users(String fname, String lname, Locations loc, String email) {

		this.fname = fname;
		this.lname = lname;
		this.loc = loc;
		this.email = email;
	}


	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Locations getLoc() {
		return loc;
	}

	public void setLoc(Locations loc) {
		this.loc = loc;
	}

	/*
	 * public List<Posts> getPosts() { return posts; }
	 * 
	 * public void setPosts(List<Posts> posts) { this.posts = posts; }
	 */

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", loc=" + loc 
				+ ", email=" + email + "]";
	}
	
	
	
	
}
