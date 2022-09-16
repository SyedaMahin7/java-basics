class Phone2{
static boolean isConnected;
public static boolean onOrOff(){
System.out.println("inside onor off");
if(isConnected==false){
isConnected=true;
System.out.println("pc is on");
}

else if(isConnected==true){
isConnected=false;
System.out.println("pc is off off");
return isConnected;
}
System.out.println("outside onoroff");
return isConnected;
}
}