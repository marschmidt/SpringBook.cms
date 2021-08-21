package com.mschmidt.springbook.cms.domain.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.mschmidt.springbook.cms.domain.models.User;
import com.mschmidt.springbook.cms.domain.repository.UserRepository;
import com.mschmidt.springbook.cms.domain.vo.UserRequest;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User update(String id, UserRequest userRequest) {
		final User user = this.userRepository.findOne(id);
		user.setIdentity(userRequest.getIdentity());
		user.setName(userRequest.getName());
		user.setRole(userRequest.getRole());
		return this.userRepository.save(user);
	}

	public User create(UserRequest userRequest) {
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setIdentity(userRequest.getIdentity());
		user.setName(userRequest.getName());
		user.setRole(userRequest.getRole());
		return this.userRepository.save(user);
	}

	public void delete(String id) {
		final User User = this.userRepository.findOne(id);
		this.userRepository.delete(User);
	}

	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	public User findOne(String id) {
		return this.userRepository.findOne(id);
	}

}
