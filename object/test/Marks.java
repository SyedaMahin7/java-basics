 class Marks{
 static  int totalMarks=200;
 static double percentage;
 static int recivedMarks;

public static double percentage(int m1,int m2){
recivedMarks=m1+m2;
percentage=(recivedMarks/totalMarks)*100;
System.out.println(percentage);
return percentage;
}

   public static void main(String m[])
{

 Marks.percentage(80,90);
  double ref=percentage;
 System.out.println(ref);
}
}