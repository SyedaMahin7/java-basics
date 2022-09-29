class Stadium{
static String stadiumNames[]={"null","null","null","null"};
static int i;
public static void addStadiumNames(String name){
	System.out.println("inside add name");
	if(stadiumNames.length<=4){
	stadiumNames[i]=name;
	i++;}
	else
	{
		System.out.println("cant add 5th element");
	}
	
	
	System.out.println("inside add name");
	
}
public static void getStadiumNames(){
for(int i=0;i<stadiumNames.length;i++){
System.out.println(stadiumNames[i]);
}
}
}