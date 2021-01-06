package com.demo.relations;


  import java.util.*;
  
  import javax.persistence.CascadeType; import javax.persistence.Entity; import
  javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
  javax.persistence.GenerationType; import javax.persistence.Id; import
  javax.persistence.JoinColumn; import javax.persistence.ManyToOne; import
  javax.persistence.Table;
  
  @Entity
  
  @Table(name="posts_table") public class Posts {
  
  
  @Id
  
  @GeneratedValue(strategy = GenerationType.IDENTITY) private int pid;
  
  private Date postDate;
  
  @JoinColumn(name="uid_fk")
  
  @ManyToOne(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER) private Users
  users;
  
  public Posts() {}
  
  public Posts(Date postDate, Users users) {
  
  this.postDate = postDate; this.users = users; }
  
  public int getPid() { return pid; }
  
  public void setPid(int pid) { this.pid = pid; }
  
  public Date getPostDate() { return postDate; }
  
  public void setPostDate(Date postDate) { this.postDate = postDate; }
  
  public Users getUsers() { return users; }
  
  public void setUsers(Users users) { this.users = users; }
  
  @Override public String toString() { return "Posts [pid=" + pid +
  ", postDate=" + postDate + ", users=" + users + "]"; }
  
  
  
  
  
  }
 