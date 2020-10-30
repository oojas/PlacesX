package recursion;

import java.util.Scanner;

public class palindroneCheck {
    public static void main(String [] args) {
    	String s="";
    	Scanner sc=new Scanner(System.in);
    	s=sc.next();
    	sc.close();
    	int start=0,end=s.length()-1;
    	boolean val=check(s,start,end);
    	System.out.println("The possibility of the string to be a palindrone is " + val);
    	}
    static boolean check(String s, int start,int end) {
    	if(start>=end) {
    		return true;
    	}
    	check(s,start+1,end-1);
    	if(s.charAt(start)==s.charAt(end)) {
    		return true;
    	}
    	else return false;
    	
    }
}
