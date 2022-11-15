package com.redis.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.demo.entity.Response;

public interface ResponseRepo extends JpaRepository<Response, Integer>{

}
