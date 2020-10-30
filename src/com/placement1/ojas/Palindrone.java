package com.placement1.ojas;

import java.util.Scanner;

public class Palindrone {
   public static void main(String [] args) {
	   String s="";
	   Scanner sc=new Scanner(System.in);
	   sc.close();
	   System.out.println("Enter the string");
	   s=sc.next();
	   boolean val=check(s);
	   System.out.println("The possibility of the string to be a palindrone is " + val);
	   
   }
   static boolean check(String s) {
	   String l=s.substring(0,s.length()/2);
	   String m=s.substring(s.length()/2,s.length()-1);
	   if(l.equals(m)) {
		   return true;
	   }
	   else 
		   return false;
   }
} 
