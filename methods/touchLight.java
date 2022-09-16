class touchLight{
static boolean isConnected;
static int currentVolume;
static int maxVolume=50;
static int minVolume;
public static boolean onOrOff(){
System.out.println("inside onOrOff()");
if(isConnected==false){
   isConnected=true;
 System.out.println("TouchLight  turned onnn");
}
System.out.println("end of onOrOff");
return isConnected;
}
public static void increaseVolume(){
if(isConnected==true){
if(currentVolume<maxVolume){
currentVolume=currentVolume+1;
System.out.println("current volume is" + currentVolume);
}
else{
System.out.println("max volume is reached");
}
}
else{
System.out.println("first touch on madu");
}
}
public static void decreaseVolume(){
if(isConnected==true){
if(currentVolume>minVolume){
currentVolume=currentVolume-1;
System.out.println("current volume is" + currentVolume);
}
else{
System.out.println("min volume is reached");
}
}
else{
System.out.println("touch on madu");
}
}
}
