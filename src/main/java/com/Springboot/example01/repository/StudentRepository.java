package com.Springboot.example01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.example01.entity.StudentClass;

public interface StudentRepository extends JpaRepository<StudentClass, Integer>{

}
