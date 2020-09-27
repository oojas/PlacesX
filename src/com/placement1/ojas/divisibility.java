package com.placement1.ojas;

//import java.util.ArrayList;
//import java.util.StringTokenizer;
import java.util.Scanner;
public class divisibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
       int a[]=new int[m];
       for(int i=0 ; i<m ; i++) {
    	   a[i]=sc.nextInt();
       }
       String b=solve(a);
       System.out.println(b);
      sc.close();
	}
	 public static String solve(int[] a){
	        int c=0;
	       for(int i=0 ; i<a.length ; i++){
	           int b=firstdigit(a[i]);
	          c=10*c+b;
	       }
	      if(c%11==0) {
	    	  return "OUI";
	      }else {
	    	  return "NON";
	    	  
	      }
	    
	    
	    }
	  public  static int firstdigit(int a){
	        int n = 0;
	        while(a>0){
	            a=a/10;
	            if(a==0){
	               break;
	            }
	            n=a;
	        }
	        return n;
	    }

}
