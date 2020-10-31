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
		  if(s.length()==0) {
			  return false;
		  }
		  if(s.length()==1) {
			  return true;
		  }
		  boolean val=true;
		  for(int i=0 ,j=s.length()-1; i<s.length()/2 ; i++,j--) {
			 if(s.charAt(i)!=s.charAt(j)) {
				 val=false;
				 break;
			 }
			 
		  }
		  return val;
	  }
}
