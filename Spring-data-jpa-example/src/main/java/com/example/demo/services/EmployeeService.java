package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository repo;

	@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	public Employee add(Employee entity) {
		
		return this.repo.save(entity);
	}
	
	public List<Employee> findAll() {
		
		return this.repo.findAll();
	}

	public List<Employee> findByDateOfBirth(LocalDate date){
		
		return this.repo.findByDateOfBirth(date);
	
	}
	public List<Employee> findByLocation(String location){
		
		return this.repo.findByLocation(location);
	}
	

	public List<Employee> findBySkillSet(String skill){
		
		return this.repo.findBySkillSet(skill);
	}
	
	public List<Employee>findByEmployeeName(String name,String place)
	{
		return this.repo.findByEmployeeName(name, place);
	}
	
	public List<Employee>findByEmployeeSkillSet(String skill,String place)
	{
		return this.repo.findByEmployeeSkillSet(skill, place);
	}
	
}
