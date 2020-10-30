package recursion;

import java.util.Scanner;

public class sumofNaturalNumbers {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		sc.close();
	 System.out.println("The sum of the numbers is " +print(n));
	}
static int print(int n) {
	if(n==1) {
		return 1;
	}
	if(n==0) {
		return 1;
	}
	return n+ print(n-1);
}
}
