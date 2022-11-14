package com.redis.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.demo.entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
