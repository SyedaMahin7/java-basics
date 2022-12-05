package com.xworkz.interview;

import java.util.Scanner;

public class Swapping {
	public static void main(String m[]) {
		System.out.println("enter the values");
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

}
