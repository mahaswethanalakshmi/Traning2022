package com.example.demo.services;
import java.sql.*;
import java.util.*;
import com.example.entity.*;

public class ProductService {

	private Connection con;

	public ProductService(Connection con) {
		super();
		this.con = con;
	}

//	public ProductService() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
//	public int updatePriceByName(String productName,double newPrice) {
//		
//	String sql = "update maha_product22 set price=? where product_Id=?";
//	
//	int rowsUpdated=0;
//	
//	return rowsUpdated;
//		
//	try(PreparedStatement pstmt = con.prepareStatement(sql)){
//		
//     //   pstmt.setInt(1,productName.getProductId());	
//        pstmt.setString(1,productName);	
//        pstmt.setDouble(2,newPrice);	
//
//	rowsUpdated = pstmt.executeUpdate();
//   
//	}
//	
//    catch (SQLException e) {
//        e.printStackTrace();
//  }
//	
//	}
	public int update (String  productName, double newValue) {
		int rowsUpdated= 0;
		String sql = " update maha_product22 set price = ? where product_Name = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setDouble(1,newValue);
			pstmt.setString(2,productName);
			
			rowsUpdated = pstmt.executeUpdate();
		
			
			}catch (SQLException e) {
			e.printStackTrace();
		}
					
		return rowsUpdated;
		
	}
	public int deleteById(int toDelete) {
		
	  String sql="delete from maha_product22 where product_Id = ?";
		
	  int rowsDeleted = 0;
	    
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
	    	
	     pstmt.setInt(1,toDelete);
	  //  rowsDeleted = pstmt.executeQuery();
	
	    }	
	      catch (SQLException e) {
	          e.printStackTrace();
	    }
		return rowsDeleted;
	
	}
	
	
	public Optional<Product> findById(int id){
		Optional<Product> obj = Optional.empty();
		
		String sql = "select * from rkj3_product where product_id = ?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
		int productId = rs.getInt("product_Id");
		String productName = rs.getString("productname");
		double price = rs.getDouble("price");
		
		Product prod = new Product(productId,productName,price);
		obj = Optional.of(prod);
		
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
public int addProduct(Product product) {
	
	int rowAdded = 0;
	
	String sql="insert into maha_product22 values (?,?,?)";
	
     try(PreparedStatement pstmt = con.prepareStatement(sql)){
		
         pstmt.setInt(1,product.getProductId());	
         pstmt.setString(2,product.getProductName());	
         pstmt.setDouble(3,product.getPrice());	

	rowAdded = pstmt.executeUpdate();
     }
     catch (SQLException e) {
         e.printStackTrace();
	}
	return rowAdded;
	
}
public List<Product> findAll(){
	
	List<Product> productList = new ArrayList<Product>();
	
	String sql = "select * from maha_product22";
	try(PreparedStatement pstmt = con.prepareStatement(sql)){
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			
			int  productId = rs.getInt("PRODUCT_Id");
		    String  productName = rs.getString("PRODUCT_NAME");
		    double price = rs.getDouble("PRICE");
		    
		    Product prod = new Product(productId,productName,price);
		    
		    productList.add(prod);
		}
	}catch (SQLException e) {
         e.printStackTrace();
	}
	
	
	return productList;
	
	
	
}
	
	
	
}
