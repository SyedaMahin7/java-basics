class ObjectTester{
public static void main(String m[]){
Object ob=new Object();
ob.a=9;
ob.b=7;
ob.add(2,7);
System.out.println(ob.a+" "+ob.b);
Object ob1=new Object();
ob1.a=8;
ob1.b=9;
System.out.println(ob1.a+" "+ob1.b);
}
}