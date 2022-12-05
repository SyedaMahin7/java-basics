package com.xworkz.interview;

public class Palidrome {
	public static void main(String m[]) {
		int num=11, rev=0,remainder,temp;
		temp=num;
		while(num!=0) {
			remainder=num%10;
			rev=num*10+remainder;	
		    num=num/10;
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("this is a polidrome");}
			
			else { 
				System.out.println("this is not polidrome");
					
	
	}
	}
}


