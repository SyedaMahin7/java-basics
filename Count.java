package com.xworkz.interview;

public class Count {
public static void main(String m[]) {
	int count=0,num=86;
	while(num!=0) {
		num/=10;
		++count;
	}
	System.out.println(count);
	
	
	
}
}
