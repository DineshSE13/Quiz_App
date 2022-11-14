package com.redis.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {
	@Id
	@GeneratedValue
	private int id;
	@OneToMany(mappedBy = "quiz")
	private List<Users> userId;
	private String createdTime;
	@OneToMany(mappedBy = "quizId")
	private List<Questions> question;
}
