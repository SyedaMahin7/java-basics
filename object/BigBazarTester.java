class BigBazarTester{
public static void main(String m[]){
BigBazar ref=new BigBazar();
ref.branch="jp nagar";
ref.gstNo="455kll";
ref.noOfWorkers=100;
System.out.println(ref.branch+" "+ref.gstNo+" "+ref.noOfWorkers);
BigBazar big=ref;
System.out.println(big.branch+" "+big.gstNo+" "+big.noOfWorkers);
}
}