package com.xworkz.interview;

public class ReversString {
	public static void revers(String data) {
		char newData[]=data.toCharArray();
		for(int i=newData.length-1;i>=0;i--) {
			System.out.println(newData[i]);
		}
	}
	public static void main(String m[]) {
		revers("mahi");
	}
	

}
