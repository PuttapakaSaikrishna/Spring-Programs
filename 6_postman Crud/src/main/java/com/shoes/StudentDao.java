package com.shoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDao {
	@Autowired
	StudentRepo repo;

//insert
	public Student insert(Student s) {
		return repo.save(s);
	}

//insert all
	public List<Student> insertall(List<Student> s) {
		return repo.saveAll(s);
	}

//getall
	public List<Student> getall() {
		return repo.findAll();
	}

//delete 
	public String deleteByid(int id) {
		repo.deleteById(id);
		return "deleted the id value" + id;
	}

//update
	public Student update(Student s) {
		Student ss = repo.findById(s.getSid()).orElse(null);
		ss.setName(s.getName());
		return repo.save(ss);
	}
//own query
	public Student findByName(String s ) {
		return repo.findByname(s);
	}
}

