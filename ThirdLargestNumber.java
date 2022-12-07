package com.xworkz.interview;

public class ThirdLargestNumber {
	public static void main(String m[]) {
		int arr[]= {50,3,25,7};
		int tmp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}	
			}
			System.out.println(arr[i]);	
		}
		System.out.println(arr[arr.length-2]);
      
		
	}

}
