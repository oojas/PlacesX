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
    	power(n);
    }
}
