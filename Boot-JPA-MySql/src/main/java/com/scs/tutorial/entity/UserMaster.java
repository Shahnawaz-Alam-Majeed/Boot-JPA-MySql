package com.scs.tutorial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="USERS" , schema = "scstestdb")
public class UserMaster {  //User_Master
	
	@Id	
	@SequenceGenerator(name = "userSequence", sequenceName = "user_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator ="userSequence")
	@Column(nullable = false, updatable = false)
	private Long userId;
	
	@Column(name="user_name",length = 20)
	private String userName;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
}
