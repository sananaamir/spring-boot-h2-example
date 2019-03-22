package com.sanan.h2example.repository;

import com.sanan.h2example.entity.User;

import org.springframework.data.repository.CrudRepository;

/**
 * Repository interface for User
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}