package com.xworkz.interview;

public class LargestAndSmallest {
	
	public static void findLargestandSmallest( int a[]) {
		
	
	int smallest=a[0];
	int largest=a[0];
	 for(int index=0; index<a.length;index++) {
		 if(a[index]>largest) {
			 largest=a[index];
		 }
		 else if(a[index]<largest) {
			 smallest=a[index];
		 }
	 }
	 System.out.println(largest);
	 System.out.println(smallest);
	}
	
	public static void main(String m[]) {
		
		int a[]= {33,56,78,90,4};
		findLargestandSmallest(a);
	}

}
