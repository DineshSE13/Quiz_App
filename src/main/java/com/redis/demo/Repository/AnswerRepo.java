package com.redis.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.demo.entity.Options;

public interface AnswerRepo extends JpaRepository<Options, Integer>{

}
