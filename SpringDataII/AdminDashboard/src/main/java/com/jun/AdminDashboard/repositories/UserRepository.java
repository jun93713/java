package com.jun.AdminDashboard.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jun.AdminDashboard.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
