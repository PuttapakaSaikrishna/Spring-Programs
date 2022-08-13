package com.shoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//pojo class, @Id

public interface StudentRepo extends JpaRepository<Student,Integer> {
	
	//To write the own set of query
	@Query("select Student from Student student where student.name=?1")
	public Student findByname(String name);
}
