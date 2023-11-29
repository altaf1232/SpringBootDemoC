package com.springbootdemo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.entity.StudentEntity;
import com.springbootdemo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	//jab bhi post man sa koi request aata hai tu wah hamre controller per aata hai 
	//step(1) sub sa pahle request yaha aata hai 
	@PostMapping("/save")
	public ResponseEntity<String> insertStudent(@RequestBody StudentEntity studentEntity){
		String status = studentService.upsert(studentEntity);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
		
	
	
}
