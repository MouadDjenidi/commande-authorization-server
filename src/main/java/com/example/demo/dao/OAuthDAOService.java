package com.example.demo.dao;

import com.example.demo.model.UserEntity;

public interface OAuthDAOService {

	public UserEntity getUserDetails(String emailId);
}