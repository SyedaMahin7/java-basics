class Cricket{

public static void main(String b[])
{
  //explicit reference
 int sachinHigestScore=200;
 int mandaraHigestScore=250;
 //int ref=sachinHigestScore ;
 //int ref2=mandaraHigestScore;
 int higestScore[]={sachinHigestScore,mandaraHigestScore};
for(int a=0;a<higestScore.length;a++){
int ref=higestScore[a];
System.out.println(ref);
//System.out.println(ref2);
}
}
}