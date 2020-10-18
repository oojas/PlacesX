package recursion;

import java.util.Scanner;

public class Recursion {
        public static void main(String []args) {
        	int n;
        	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
         System.out.print("The Sum is "+ sum(n));
         sc.close();
        }
        
        static int sum(int n) {
        	if(n==1) {
        		return 1;
        	}
        	
              return n+sum(n-1);

        	
        		
        }
}
