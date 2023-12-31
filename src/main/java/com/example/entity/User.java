package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mytable")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String email;

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}