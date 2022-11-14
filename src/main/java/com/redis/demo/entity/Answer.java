package com.redis.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@GeneratedValue
	private int id;
	private String options;
	@ManyToOne
	private Questions questionId;
	private boolean isAnswer;
	public Answer() {
		super();
	}

}
