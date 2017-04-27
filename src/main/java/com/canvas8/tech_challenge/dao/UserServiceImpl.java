package com.canvas8.tech_challenge.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.canvas8.tech_challenge.model.User;
import com.canvas8.tech_challenge.repository.UserRepository;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAllUsers() {
		return  userRepository.findAll();
	}

	@Override
	public User findById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public boolean isUserExist(User user) {
		return findByEmailId(user.getEmailId())!= null;
	}

	private Object findByEmailId(String emailId) {
		
		return null;
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.delete(id);
		
	}

	@Override
	public User findByName(String firstName) {
		return userRepository.findByFirstName(firstName);
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
	}


}
