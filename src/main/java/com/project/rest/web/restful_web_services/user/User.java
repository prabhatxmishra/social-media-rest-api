package com.project.rest.web.restful_web_services.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


public class User {

	private Integer id;
	@Size(min=2, message="Name should have more than 2 caracters")
	private String name;
	@Past(message="Dob should be in the past")
	private LocalDate date;
	
	
	public User(Integer id, String name, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
}
