package com.placement1.ojas;

import java.util.*;

public class arryaequal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			boolean isequal=false;
			int m=sc.nextInt();
			int a[]=new int[m];
			int b[]=new int[m];
			boolean c[]=new boolean[m];
			for(int i=0 ; i<m ; i++) {
				a[i]=sc.nextInt();
			}
			for(int j=0 ; j<m ; j++) {
				b[j]=sc.nextInt();
			}
			//int count=0;
			for(int i=0 ; i<m ; i++) {
				 isequal=false;
				for(int j=0 ; j<m ; j++) {
					if(a[i]==b[j] && c[j]!=true) {
						c[j]=true;
						isequal=true;
						break;
					}
				}
			}
			if(isequal) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			t--;
		}
		sc.close();
    	}

}
