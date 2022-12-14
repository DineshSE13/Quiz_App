package com.redis.demo.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	@Enumerated(EnumType.STRING)
	private QuestType questType;
	@OneToMany(mappedBy = "questionId")
	private List<Options> answer; 
	@ManyToOne
	private Test testId;
	@OneToMany(mappedBy = "question")
	private List<Response> response;
}
