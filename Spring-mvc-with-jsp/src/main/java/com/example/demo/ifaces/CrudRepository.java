package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.entity.Product;

public interface CrudRepository<T> {

	public int add(T t);
	public List<T> findAll();
	public int update(T t);
	public List<Product> findById(int id);
	public int remove(int id);
	
}
