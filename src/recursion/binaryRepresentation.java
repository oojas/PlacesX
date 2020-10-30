package recursion;

import java.util.Scanner;

public class binaryRepresentation {
  public static void main(String[] args) {
	  int n;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number ");
	  n=sc.nextInt();
	  sc.close();
	  print(n);
  }
  static void print(int n) {  //this program converts the decimal number into binary representation
	  if(n==0) {
		  return ;
	  }
	  print(n/2);
	  System.out.print(n%2 + " ");
  }
}
