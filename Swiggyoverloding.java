class Swiggyoverloding{
 
public static double takeOrder(String menu){
if(menu=="mosaranna"){
System.out.println(menu);
return 45.00;

}
if(menu=="pestri"){
System.out.println(menu);
return 50.00;

}
if(menu=="somosa"){
System.out.println(menu);
return 15.00;

}
if(menu=="dosa"){
System.out.println(menu);
return 50.00;

}
return 0.0;
}
public static double takeOrder(String menu, int quantity){
if(menu=="mosaranna"){
System.out.println(menu);
return 45.00*quantity;

}
if(menu=="pestri"){
System.out.println(menu);
return 50.00*quantity;

}
if(menu=="somosa"){
System.out.println(menu);
return 15.00*quantity;

}
if(menu=="dosa"){
System.out.println(menu);
System.out.println(quantity);
return 50.00*quantity;

}
return 0.0;
}

}