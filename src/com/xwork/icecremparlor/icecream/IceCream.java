package com.xwork.icecremparlor.icecream;

public class IceCream {
	public String name;
	public String staff[];
	public String billing[];

	/*by  defalalt constructor*/

	/*public MilkParlor() {
		System.out.println("Milkparlor  is called");
	}*/

	public IceCream(String name,String staff[],String billing[]) {
		this.name=name;
		this.staff=staff;
		this.billing=billing;
		
		
	}
	public void display() {
		 System.out.println(name);
		 for(int i=0;i<staff.length;i++) {
			 System.out.println(staff[i]);
		 }
		 for(int i=0;i<billing.length;i++) {
			 System.out.println(billing[i]);
		 }
		 


	}
}
