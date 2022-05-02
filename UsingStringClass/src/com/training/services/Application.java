package com.training.services;

public class Application {

	public static void main(String[] args) {
		
		StringService service = new StringService();
		
		String city = "CHENNAI";
		
		System.out.println(String.format("%s", city));
		
		System.out.println(String.format("%2$.4f %1$.2f %3$.2f", 100.243,200.256,300.369));

		
		int key =14;
		switch (key) {
		case 1:
			service.stringEquals("madesh", "madesh");
			break;
			
		case 2:
			service.stringObjectEquals();
            break;
            
		case 3:
            service.usingTrim(" ramesh ");
			break;
			
		case 4:
			service.lengthOfString(" ramesh " );
			break;
			
		case 5:
			service.usingSubString("Good Morning Thala");
			break;
			
		case 6:
			service.usingCharAtIndexOf("madesh@waran.com");
			break;
			
		case 7:
			service.usingReplace("madesh@waran.com" , "Welcome to Excelacom");
			break;
			
		case 8:
			service.usingConcat("pattikadu", "suniyakari");
			break;
			
		case 9:
			service.usingCompareTo("b", "c");
			break;
		
		case 10:
		    service.usingStringFormat("madhu" , 45.678);
		    break;
			
		case 11:
			service.usingStringFormat(17);
			break;
			
		case 12:
		    service.usingStringFormat(16, 16);
			break;
			
		case 13:
			service.usingStringFormat("madesh" , "madesh");
			break;
			
		case 14:
			service.usingStringFormat(-404l);
		default:
			break;
		}
	}
	
}
