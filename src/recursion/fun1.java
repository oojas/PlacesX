package recursion;

import java.util.Scanner;

public class fun1 {
   public static void main(String [] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the fun number");
	   int n=sc.nextInt();
	   sc.close();
	   fun(n);
	   
   }
   static void fun(int n) {
	   if(n==0) {
		   return ;
	   }
	   fun(n-1);
	   System.out.print(n+ " ");
	   fun(n-1);
   }
}
