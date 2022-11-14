package com.redis.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.demo.entity.Result;

public interface ResultRepo extends JpaRepository<Result, Integer>{

}
