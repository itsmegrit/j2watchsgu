package com.sgu.j2watch.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sgu.j2watch.entities.Account;
import com.sgu.j2watch.entities.User;


@Service
public interface UserService{
	public Iterable<User> findAll();
	
	public Optional<User> findById(int id_user);

	public List<User> find();
	
	public boolean updateResetPassword(String token, String email);
	
	public User get(String reset_password_token);
	
	public void updatePassword(User user, String newPassword);
	
	List<User> searchNameOrEmail(String key);
	
	List<User> searchTypeAndRole(Integer idType, Integer idRole );

}
