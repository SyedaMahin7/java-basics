class Beaches{
static String beachNames[]={"null","null","null","null","null"};
static int index;
public static boolean addBeachNames(String name){
	System.out.println("inside addBeachname");
	if(beachNames.length<=5)
	{
	beachNames[index]=name;
	index++;
	}
	else{
		System.out.println(" you cannot add 6th element");
	}
		System.out.println("end ofaddBeachname");   
	     return true;
}
public static void getBeachesName(){
for(int i=0;i<beachNames.length;i++){
   System.out.println(beachNames[i]);

}

}


}