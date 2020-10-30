package recursion;

import java.util.Scanner;

public class onetonprogram {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		n=sc.nextInt();
		sc.close();
		print(n);
		int m=1;
		System.out.println();
		printtail(n,m);

	}
     
	static void print(int n) {
		if(n==0) {
			return ;
		}
		print(n-1);
		System.out.print(n+ " ");
	}
	static void printtail(int n,int m) { // this function is a better approach to solve this problem as this is tail recursion
	 	 if(m>n) {
	 		 return ;
	 	 }
	 	 System.out.print(m + " ");
	 	 printtail(n,m+1);
	}
}
