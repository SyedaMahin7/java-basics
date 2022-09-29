class TouristPlaces{
static String touristNames[]={"null","null","null","null"};
static int i;
public static void addTouristNames(String name){
	System.out.println("inside add name");
	if(touristNames.length<=4){
	touristNames[i]=name;
	i++;}
	else
	{
		System.out.println("cant add 5th element");
	}
	
	
	System.out.println("inside add name");
	
}
public static void getTouristNames(){
for(int i=0;i<touristNames.length;i++){
System.out.println(touristNames[i]);
}
}
}