class WashingMachine2{
static boolean isConnected;
static int maxVolume=5;
static int currentVolume;
static int minVolume;
public static void OnOrOff()
{
    System.out.println("inside onoff");
    if(isConnected==false)
    {
        isConnected=true;
         System.out.println("washing machine is on ");
     }
     else if(isConnected==true)
     {
     isConnected=false;
     System.out.println("washing machine is off");
     } 
System.out.println("end of onoroff");
}
public static void increaseVolume()
{
   System.out.println("inside maxVolume");
   if(isConnected==true)
   {
    if(currentVolume<maxVolume)
     {
      currentVolume=currentVolume+1;
      System.out.println("Current volume is"+currentVolume);
     }
     else
      {
       System.out.println("max volum is reched");
      }
    }
    else{
         System.out.println("madalu machine on madu");
         }
}
public static void decreaseVolume()
{
   System.out.println("inside decreaseVolume");
   if(isConnected==true)
   {
    if(currentVolume>minVolume)
     {
      currentVolume=currentVolume-1;
      System.out.println("Current volume is"+currentVolume);
     }
     else
      {
       System.out.println("min volum is reched");
      }
    }
    else{
         System.out.println("madalu machine on madu");
         }
}


}