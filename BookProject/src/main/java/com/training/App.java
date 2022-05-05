package com.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //  System.out.println( "Hello World!" );
        
        Book java = new Book(404,"RICH DAD POOR DAD");
        System.out.println(" Book Number :" +java.getBookId());
        System.out.println(" Book Name :" +java.getBookName());
       System.out.println(java); 
       
    }
}
