class VivantaTajHotel
{
 public static void main(String k[])
{
  String type="4 star hotel";
  String address="rajaji nagar ";
  String managerNames[]={"mahin","anusha","harshita","dharani"};
  int noOfManagers=4;
  String foodMenu[]={"biryani","palao","parota","tommoto soup","edli","sambar","medu vada","chiken pokoda","motton korma","puri","dosa","uppit","poha","fish cuury","zilemi"};
  System.out.println("welcome to EmperialHotel");
  System.out.println("this hotel is rated with" +" "+ type);
  System.out.println("hotel is located in" + " "+ address);
  System.out.println("list of manager names are" );
  for(int a=0;a<managerNames.length;a++)
  {
     System.out.println(managerNames[a]);
  }
  System.out.println("food menu is" );
  for (int b=0;b<foodMenu.length;b++)
   {
     System.out.println(foodMenu[b]);

  }

}
}