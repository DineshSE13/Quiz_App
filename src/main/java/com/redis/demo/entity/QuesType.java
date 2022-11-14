package com.redis.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuesType {
	
	@Id
	@GeneratedValue
	private int id;
	@OneToMany(mappedBy = "typeId")
	private List<Questions> questions;
	private String type;
}
