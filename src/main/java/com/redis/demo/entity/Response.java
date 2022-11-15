package com.redis.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Response 
{
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Test test;
	@ManyToOne
	private Questions question;
	private String selectedanswer;
}
