package com.redis.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.demo.entity.Users;

public interface UserRepo extends JpaRepository<Users,Integer> {

}
