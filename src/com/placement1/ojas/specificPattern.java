package com.placement1.ojas;

import java.util.*;

public class specificPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    ArrayList<String> s=new ArrayList<String>();
   // ArrayList<String> s1=new ArrayList();
     List<Integer> check=new ArrayList<Integer>();
     for(int i=0 ; i<256 ; i++) {
    	 check.add(i,0);
     }
     List<Integer> check1=new ArrayList<Integer>();
     for(int i=0 ; i<256 ; i++) {
    	 check1.add(i,0);
     }
     for(int i=0 ; i<4 ; i++) {
    	 s.add(i,sc.next());
     }
     String s1=sc.next();
     int i=0;
     for(char c : s.get(i).toCharArray()) {
    	 int index=(int)c;
    	 check.set(i,index++);
    	 i++;
     }
     i=0;
     for(char c : s1.toCharArray()) {
    	 int index=(int)c;
    	 check1.set(i,index++);
    	 i++;
     }
     int count=0,sum=0;
     for(int j=0 ; j<256 ; j++) {
    	 count+=check.get(j);
    	 sum+=check1.get(i);
     }
     sc.close();
     if(count==sum) {
    	 System.out.println("YES");
     }else System.out.println("NO");
	}
}
