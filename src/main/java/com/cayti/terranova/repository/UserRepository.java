package com.cayti.terranova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cayti.terranova.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
