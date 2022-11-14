package com.redis.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Result {
	@Id
	@GeneratedValue
	private int id;
	private String quizId;
	private String userId;
	private String questionId;
}
