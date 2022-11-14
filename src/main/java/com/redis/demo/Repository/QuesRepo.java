package com.redis.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.demo.entity.Questions;

public interface QuesRepo extends JpaRepository<Questions,Integer> {

}
