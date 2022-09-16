class Truffeles
{
 public static void main(String k[])
{
  String type="5 star hotel";
  String address="koramangala ";
  String managerNames[]={"mahin","anusha","harshita","dharani"};
  int noOfManagers=4;
  String foodMenu[]={"pasta salad","caesar salad","Russian salad","tommoto soup","Greek salad","Cruncy  chikensalad","Mexican Nachos Grade","Tandoori chiken Burger","Sloppy joe","tex Max chicken burger","peri peri chiken","crumbed chiken burger","lamb burger"};
  System.out.println("welcome to Truffeles");
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