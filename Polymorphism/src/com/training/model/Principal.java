package com.training.model;

import com.training.ifaces.Conditional;

public class Principal implements Conditional {

//	@Override
//	public boolean test(Object value) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	private String typeOfCollege;
	
	public Principal() {
		super();
		// TODO Auto-generated constructor stub
}

	public Principal(String typeOfCollege) {
	super();
      this.typeOfCollege = typeOfCollege;	}

	public String getTypeOfCollege() {
		return typeOfCollege;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}

	@Override
	public boolean test(Object value) {
		 String strLocation = (String)value;
		    boolean result = false;
		     
		    if(this.typeOfCollege.equals("engg") && strLocation.equals("rural"))
		    {
		    	result = true;
		    }
			return result;
}
	
	
	
	
	
}
