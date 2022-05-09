package com.example.demo.repo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;

@Repository
public class ProductRepository implements CrudRepository<Product> {

private JdbcTemplate template;

@Autowired
public ProductRepository(JdbcTemplate template) {
super();
this.template = template;
}

@Override
public int add(Product t) {

String sql = "insert into maha_product22 values(?,?,?)";

return template.update(sql, t.getProductId(),t.getProductName(),t.getPrice());
}

  @Override
 public List<Product> findAll() {

 String sql = "select * from maha_product22";


  return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
 }

  @Override
  public int update(Product t) {
   
	  String sql = "update maha_product22 set product_name=? where product_id = ?";
	  return template.update(sql,t.getProductName(),t.getProductId());
 }

  @Override
  public List<Product> findById(int id) {
	  try {
	String sql = "select * from maha_product22 where product_id = ?";
	return  template.query(sql, BeanPropertyRowMapper.newInstance(Product.class),id);
  }catch(IncorrectResultSizeDataAccessException e){
	  return null;
  }
  }
  @Override
  public int remove(int id) {

	  return template.update("DELETE FROM maha_product22 WHERE product_id=?", id);
  }




}





