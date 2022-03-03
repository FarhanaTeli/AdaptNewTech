package com.hibernateDemo.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users_info")
public class UserDatabase 
{
	@Id
	@Column(name="userid")
	int userid;
	
	@Column(name="username")
	String username;
	
	@Column(name="password")
	String password;
	
	@Column(name="fname")
	String fname;
	
	@Column(name="lname")
	String lname;

	public int getUserid() {
		return userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public UserDatabase(String username, String password, String fname, String lname) 
	{
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
	}
	public UserDatabase()
	{
		
	}

	@Override
	public String toString() {
		return "UserDatabase [userid=" + userid + ", username=" + username + ", password=" + password + ", fname="
				+ fname + ", lname=" + lname + "]";
	}

}
