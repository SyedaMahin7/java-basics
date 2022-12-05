package com.xworkz.interview;

public class CountString {
	public static void revers(String data) {
		int count=0;
		char newData[]=data.toCharArray();
		for(int i=newData.length-1;i>=0;i--) {
			System.out.println(newData[i]);
			count++;
			System.out.println(count);
			
		}
	}
	public static void main(String m[]) {
		revers("mahi");
		
	}

}
