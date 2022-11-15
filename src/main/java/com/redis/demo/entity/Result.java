package com.redis.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Result {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Users userName;
	private String totalQuestion;
	private String correctAnswer;
}
