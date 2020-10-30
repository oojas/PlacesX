package recursion;

import java.util.Scanner;

public class ntoOne {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int m=1;
		print(n,m);
		sc.close();
		System.out.println();
		print(n);
		
				
	}
	static void print(int n, int m) { // This is one approach
		if(m>n) {
			return ;
		}
		print(n,m+1);
		System.out.print(m + " "); 
	}
	static void print(int n) { // This is a better approach because this is a tail recursion since the function
		                          // has to do nothing after the recursion call
		if(n==0) {
			return;
		}
		System.out.print(n+ " ");
		print(n-1);
	}

}
