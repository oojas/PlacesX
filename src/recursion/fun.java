package recursion;

import java.util.Scanner;

public class fun {
   public static void main(String [] agrs) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int n=sc.nextInt();
	   sc.close();
	   foo(n);
	   
   }
   static void foo(int n) {
	   if(n==0) {
		   return ;
	   }
	   System.out.println(n);
	   foo(n-1);
	   System.out.println(n);
	   System.out.println();
   }
}
