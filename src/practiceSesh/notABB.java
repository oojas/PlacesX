package practiceSesh;
import java.util.Scanner;
public class notABB {
      public static void main(String [] args) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the String");
    	  String s=sc.next();
    	  sc.close();
    	  String b="aab";
    	    boolean a=s.contains(b);
    	    if(a) {
    	    	System.out.println("The String is accepted");
    	    }
    	    else
    	    System.out.println("The Stirng cannot be accepted");
    	  
      }
}
