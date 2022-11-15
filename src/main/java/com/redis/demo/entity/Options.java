package com.redis.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Options {
	@Id
	@GeneratedValue
	private int id;
	private String options;
	@ManyToOne
	private Questions questionId;
	private boolean isAnswer;
	public Options() {
		super();
	}

}
