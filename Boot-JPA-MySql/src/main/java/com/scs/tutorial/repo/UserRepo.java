package com.scs.tutorial.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scs.tutorial.entity.UserMaster;

public interface UserRepo extends JpaRepository<UserMaster, Long>{

}
