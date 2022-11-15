package com.redis.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class Test { 
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Users userId;
	private String createdTime;
	@OneToMany(mappedBy = "testId")
	private List<Questions> question;
	@OneToMany(mappedBy = "test")
	private List<Response> response;
}
