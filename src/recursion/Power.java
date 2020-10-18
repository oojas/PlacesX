package recursion;
import java.util.Scanner;
public class Power {
    public static void main(String [] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Number");
    	int n=sc.nextInt();
    	System.out.println("Enter the value to which has to be calculated");
    	
    	int m=sc.nextInt();
    	sc.close();
    	int a=power(n,m);
    	System.out.println("the power is "+ a);
    }
    static int power(int n,int m) {
    	if(m==0) {
    		return 1;
    	}
    	return power(n,m-1)*n;
    }
}
