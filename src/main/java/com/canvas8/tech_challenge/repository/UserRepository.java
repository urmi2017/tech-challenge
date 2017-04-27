package com.canvas8.tech_challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.canvas8.tech_challenge.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 User findByEmailId(String emailId);
 User findByFirstName(String firstName);
 User findByLastName(String lastName);
 User findByGroupId(String groupId);
}
