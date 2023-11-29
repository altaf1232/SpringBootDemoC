package com.springbootdemo.service;

import com.springbootdemo.entity.StudentEntity;

public interface StudentService {
	   //step(2) phir request yaha aata 
	  public String upsert(StudentEntity studentEntity);
		 
}
