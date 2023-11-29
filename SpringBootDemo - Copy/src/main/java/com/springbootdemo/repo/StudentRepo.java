package com.springbootdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springbootdemo.entity.StudentEntity;
         
@Repository       //step(4) yaha per phir aata hai
public interface StudentRepo extends JpaRepository<StudentEntity, Long> {

}
