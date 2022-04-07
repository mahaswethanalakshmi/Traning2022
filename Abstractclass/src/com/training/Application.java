package com.training;
import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.VechicleInsurance;
import com.training.model.LifeInsurance;
public class Application {
	public static void printPremium(Insurance object)
	{
		System.out.println("Premium:=" +object.calculatePremium());
	}

	public static void main(String[] args) {
		
         
          VechicleInsurance car = new VechicleInsurance(123, "Jerisha", "car", 2019);
	      printPremium(car);
	
	      LifeInsurance life= new LifeInsurance(123, "maha" ,21);
	      printPremium(life);
	      
	      
	      String[] seek = {"ent" ,"corona" };
	      HealthInsurance health = new HealthInsurance(3030, "RK The Leader",seek);
	      printPremium(health);
	
	}
	}