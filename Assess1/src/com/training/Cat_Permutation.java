package com.training;

public class Cat_Permutation {
	
	  static void printPermutation(String s, String result)
    {
     if (s.length() == 0) {
        	System.out.println(result + " ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String str = s.substring(0, i) + s.substring(i + 1);
            printPermutation(str, result + ch);
        }
    }
 
    public static void main(String[] args)
    {
        printPermutation("cat"," ");
    }
}