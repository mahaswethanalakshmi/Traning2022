package com.example.resources;

import java.util.List;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;
import com.example.model.Student;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/products")
public class ProductResource {

	private static ProductService service = new ProductService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  List<Product> findAll()
	{
		return service.findAll();
		
		
	}
	
	@GET
	@Path("/srch/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public  Response findById(@PathParam("id")int id)
	{
		try {
			Product entity = service.findById(id)
					.orElseThrow(()-> new RuntimeException("Id Not Found"));
			return Response.ok(entity).build();
		} catch (RuntimeException e) {
          e.printStackTrace();		}
		return Response.ok("Id Not Found").status(400).build();
	}
	//	return service.findById(id);	
	
	

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Product product)
	{

		
		int result=service.addProduct(product);
		if(result!=0) {
			return Response.ok(product).status(201).build();
		}else {
			return Response.status(400, "Not Created").build();
		}
		
	}
	
	@DELETE
	@Path("/srch/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("id") int id )
	{
		int result=service.deleteById(id);
		if(result!=0) {
			return Response.status(204,"One resources deleted").build();
		}else {
			return Response.status(400, "Not Deleted").build();
		}
		
	}
	
	@PUT
	@Path("/{productName}/{newPrice}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateById(@PathParam("productName") String productName , @PathParam("newPrice") double newPrice)
	{
	int result=service.update(productName, newPrice);
	return Response.ok("updated"+result+"rows").build();

	}




}
	
	
	
	

