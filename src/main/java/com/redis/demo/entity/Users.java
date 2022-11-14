package com.redis.demo.entity;

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
	@ManyToOne
	private Quiz quiz;
}