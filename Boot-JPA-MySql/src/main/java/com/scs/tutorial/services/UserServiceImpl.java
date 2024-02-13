package com.scs.tutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scs.tutorial.entity.UserMaster;
import com.scs.tutorial.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
		
	@Override
	public String addUser(String name) {
		UserMaster userMaster = new UserMaster();
		userMaster.setUserName(name);
		UserMaster um	= userRepo.save(userMaster);
		return um.getUserName() ;
	}

}
