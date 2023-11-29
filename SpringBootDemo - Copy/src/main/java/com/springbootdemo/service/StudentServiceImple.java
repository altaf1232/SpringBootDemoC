package com.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdemo.entity.StudentEntity;
import com.springbootdemo.repo.StudentRepo;
@Service
public class StudentServiceImple implements StudentService {
    //step(3) phir yaha per request aata hai
	@Autowired
	private StudentRepo repo;
	
	
	@Override
	public String upsert(StudentEntity studentEntity) {
		repo.save(studentEntity);
		return "Success";
	}

}
