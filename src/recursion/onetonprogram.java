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

	}
     
	static void print(int n) {
		if(n==0) {
			return ;
		}
		print(n-1);
		System.out.print(n+ " ");
	}
}
