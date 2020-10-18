package recursion;
import java.util.Scanner;
public class Factorial {
  public static void main(String [] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  sc.close();
	  System.out.println("the Factorial of "+ n + " is " + fact(n) );
  }
  static int fact(int n) {
	  if(n==1) {
		  return 1;
	  }
	  int m=fact(n-1);
	  return n*m;
  }
} 
// Using Principal of Mathematical Induction 
// 1. Base Case : 
// 2. Induction Hypothesis : ASSUME that f(k) is true
// 3. Induction : Using Step 2 prove that it is true for f(k+1) also.

// This can be summarized with :
// 1. Base Case : 
// 2. Recursive Call :
// 3. Small Calculation :