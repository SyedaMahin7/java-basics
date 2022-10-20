package com.xwork.icecremparlor;

import com.xwork.icecremparlor.icecream.*;

public class IceCreamTester {
	public static void main(String n[]) {
		String staff[]=new String[2];
		staff[0]="mahi";
		staff[1]="syeda";
		
		
		String billing[]=new String[2];
		billing[0]="cash";
		billing[1]="online";
		IceCream ref=new IceCream("ashoka",staff,billing);
		//ref.name="milk daily";
		//ref.staff=new String[2];
		//ref.staff[0]="mahi";
		//ref.staff[1]="syeda";
		
		//ref.billing=new String[2];
		//ref.billing[0]="cash";
		//ref.billing[1]="online";
		ref.display();
		
		
		
		
	}

}
