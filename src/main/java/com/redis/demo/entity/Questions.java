package com.redis.demo.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Questions {
	@Id
	@GeneratedValue
	private int id;
	private String question;
	@ManyToOne
	private QuesType typeId;
	@OneToMany(mappedBy = "questionId")
	private List<Answer> answer;
	@ManyToOne
	private Quiz quizId;
}
