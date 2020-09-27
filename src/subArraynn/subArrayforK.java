package subArraynn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class subArrayforK {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  for(int i=0 ; i<n ; i++) {
			  a[i]=sc.nextInt();
		  }
		  int k=sc.nextInt();
		  sc.close();
		  boolean found=false;
		  Set<Integer> sets=new HashSet<>();
		  int sum=0;
		  for(int c : a) {
			  sets.add(sum);
			  sum+=c;
			  if(sets.contains(sum-k)) {
				  found =true;
				  break;
			  }
		  }
		  System.out.println("Found "+found);
	}
//	String a="";
//String b="asd";
//	boolean val=a.

}
