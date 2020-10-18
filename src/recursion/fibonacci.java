package recursion;

import java.util.Scanner;

public class fibonacci {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of which you want the fibonacci number");
		int n=sc.nextInt();
		System.out.println(fib(n));
		
		sc.close();
		
	}
	static int fib(int m) {
		if(m==0) {
			return 0;
		}
		if(m==1) {
			return 1;
		}
		int a=fib(m-1);
		int b=fib(m-2);
		return a+b;
	}

}
