package practiceSesh;

import java.util.Scanner;

public class palindrone {

	 public static void main(String [] args) {
		   
		   Scanner sc=new Scanner(System.in);
		  
		   System.out.println("Enter the string");
		 String  s=sc.next();
		   boolean val=check(s);
		   System.out.println("The possibility of the string to be a palindrone is " + val);
		   sc.close();
	   }
	   static boolean check(String s) {
		   String l=s.substring(0,s.length()/2);
		   String m=s.substring((s.length()/2)+1,s.length());
		   System.out.println(l);
		   System.out.println(m);
		   
		   if(l.) {
			   return true;
		   }
		   else 
			   return false;
	   }
}
