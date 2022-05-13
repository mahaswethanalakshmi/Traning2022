package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.entity.Product;

import com.example.demo.repo.ProductRepository;

@Controller
public class ProductContorller {
	
	@Autowired
	private Product entity;
	
	@Autowired
	private ProductRepository repo;
	
    @RequestMapping(value = "/product",method = RequestMethod.GET)
	public String intiForm(Model model) {
		
		model.addAttribute("title" , "Add Products");
		model.addAttribute("command",entity);
		
		return "addProduct";
		}
    @RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Product entity) {
	
    	int rowAdded= this.repo.add(entity);
    	return "addProduct";
//		int rowAdded ;
//		try {
//			rowAdded= this.repo.add(entity);
//			return "success";
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "failure";
//		}
    }
		@RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
		public String findById(@PathVariable(value = "id")Integer id ,Model model) {
	    model.addAttribute("find",repo.findById(id));
	      return "findById";
	}
		@RequestMapping(value = "/product/remove/{id}",method = RequestMethod.GET)
		public String remove(@PathVariable(value = "id")Integer id ,Model model) {
	    model.addAttribute("find",repo.remove(id));
	      return "removeId";
		}
	      @RequestMapping(value="/",method=RequestMethod.GET)
	  	public String indexUsing(Model model) {
	  		model.addAttribute("title","options");
	  		return "index";
	  	}
		
		}

