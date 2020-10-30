package recursion;

import java.util.Scanner;

public class loginfo {
    public static void main(String [] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Number for whom you want to find the log");
    	int n=sc.nextInt();
    	int m=log(n);
    	System.out.println(m);
    	sc.close();
    }
   static int log(int n) {
    	if(n==1) {
    		return 0;
    	}
    	return 1 + log(n/2);
    }
}
