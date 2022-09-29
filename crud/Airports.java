class Airports{
static String airportsNames[]={"null","null","null","null"};
static int i;
public static void addNames(String name){
	System.out.println("inside add name");
	if(airportsNames.length<=4){
	airportsNames[i]=name;
	i++;}
	else
	{
		System.out.println("cant add 5th element");
	}
	
	
	System.out.println("inside add name");
	
}
public static void getAirportNames(){
for(int i=0;i<airportsNames.length;i++){
System.out.println(airportsNames[i]);
}
}
}