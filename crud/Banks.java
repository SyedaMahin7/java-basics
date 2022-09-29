class Banks{
static String bankNames[]={"null","null","null","null"};
static int i;
public static void addBankNames(String name){
	System.out.println("inside add name");
	if(bankNames.length<=4){
	bankNames[i]=name;
	i++;}
	else
	{
		System.out.println("cant add 5th element");
	}
	
	
	System.out.println("inside add name");
	
}
public static void getBankNames(){
for(int i=0;i<bankNames.length;i++){
System.out.println(bankNames[i]);
}
}
}