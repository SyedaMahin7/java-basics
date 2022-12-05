package com.xworkz.interview;

public class InterviewTester {
	public static void reverse(String data) {
	   char newData[]= data.toCharArray();
	   for(int i=newData.length-1;i>=0;i--) {
		   System.out.print(newData[i]+" ");
	   }
	   for(int i=0;i<newData.length;i++) {
		   System.out.println(newData[i]+" ");
	   }
	//   public static void upper(string upper) {
		   
	   }//assending order ad desending order
		
		
	public static void main(String m[]) {
		reverse("mahin");
		//upper("mahin");
		//reversemiddele("my name is");
	}

}
