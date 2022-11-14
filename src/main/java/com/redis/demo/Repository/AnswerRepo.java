package com.redis.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.demo.entity.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Integer>{

}
