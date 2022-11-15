package com.redis.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "Users")
public class Users {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	@OneToMany(mappedBy = "userId")
	private List<Test> quiz;
	@OneToMany(mappedBy = "userName")
	private List<Result> resultId;
	
}