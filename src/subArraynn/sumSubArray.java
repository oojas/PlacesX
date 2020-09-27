package subArraynn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sumSubArray {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0 ; i<n ; i++) {
		  a[i]=sc.nextInt();
	  }
	  sc.close();
	  boolean found=false;
//	  for(int i=0 ; i<a.length ; i++) {
//		  int sum=0;
//		  for(int j=i ; j<a.length; j++) {
//			  sum+=a[j];
//			  if(sum==0) {
//				  found=true; code using brute force having time complexity of n^2.
//				  break;
//			  }
//			 
//		  }
//		  if(found)break;
//		  
//	  }
	 
    Set<Integer> set =new HashSet<>();
    int sum=0;
    for(int c : a) {
    	set.add(sum);
    	sum+=c;
    	if(set.contains(sum)) {
    		found=true;
    		break;
    	}
    }
    System.out.println("Found "+ found);
	}

}
