class Revers{
public static void main(String h[]){
int a=8987,remainder,r=0;
while(a!=0){
remainder=a%10;
r=r*10+remainder;
a=a/10;

}
System.out.println(r);
}
}                    