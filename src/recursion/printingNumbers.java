package recursion;

import java.util.Scanner;

public class printingNumbers {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the limity to print numbers");
    	 int n=sc.nextInt();
    	 sc.close();
    	 pnum(n);
    	 
     }
     static void pnum(int n) {
    	 if(n==0) {
    		 return;
    	 }
    	 pnum(n-1);
    	 System.out.println(n+ " ");
  
     }
}
