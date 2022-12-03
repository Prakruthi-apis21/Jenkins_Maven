package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserService {
	ArrayList<User> al= new ArrayList<User>();
	
	public boolean loginValidate(User user) {
		if(user.getUname().equals("admin") && user.getPass().equals("manager")) {
			
			return true;
		}
		return false;
	}
	
	public void addUser(User user) {
		al.add(user);
	}
	
public List<User> loadAll(){
	return al;
}

public boolean findUser(String name) {
	for (User user: al) {
		if(user.getUname().equals(name)) {
			return true;
		}
	}
	return false;
}
public boolean deleteUser(String name) {
	for (User user: al) {
		if(user.getUname().equals(name)) {
			al.remove(user);
			return true;
		}
	}
	return false;
}

public boolean updateUser(String uname,User user) {
	
	
	
	return true;
}


}
