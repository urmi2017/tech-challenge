package com.canvas8.tech_challenge.dao;

import java.util.List;

import com.canvas8.tech_challenge.model.User;

public interface UserService {

	User findById(Long id);
	 
    User findByName(String FirstName);
 
    void saveUser(User user);
 
    void updateUser(User user);
 
    void deleteUserById(Long id);
 
    void deleteAllUsers();
 
    List<User> findAllUsers();
 
    boolean isUserExist(User user);
}
