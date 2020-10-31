package recursion;
import java.util.*;
public class sumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number");
   int n=sc.nextInt();
   sc.close();
   int sum=0;
        System.out.println("The sum of the digits is " +checksum(n,sum));
       
	}
	static int checksum(int n, int sum) {
		if(n==0) {
			return sum;
		}
		return sum+checksum(n/10,n%10);
	}

}
