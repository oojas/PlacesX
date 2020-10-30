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
		
		
				
	}
	static void print(int n, int m) {
		if(m>n) {
			return ;
		}
		print(n,m+1);
		System.out.print(m + " ");
	}

}
