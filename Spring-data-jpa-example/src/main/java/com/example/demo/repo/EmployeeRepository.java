package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Integer> {

	public List<Employee> findByDateOfBirth(LocalDate date);

	public List<Employee> findByLocation(String location);

	public List<Employee> findBySkillSet(String skill);


	@Query(nativeQuery = true,
		value = "select * from maha_employees where employee_name =:empName or location =:empLocation")
	public List<Employee>findByEmployeeName(@Param("empName")String empName,@Param("empLocation")String empLocation);


	@Query(nativeQuery = true,
		value = "select * from maha_employees where skill_set =:empskillset and location =:empLocation")
	public List<Employee>findByEmployeeSkillSet(@Param("empskillset")String empskillset,@Param("empLocation")String empLocation);


}
