class TeaStall{
static int teaStallId;
static String name;
static long contactNo;
static String branch;
public static void setTeaStallId(int id){
	
	teaStallId=id;
}
public static int getTeaStallId()
{
	
	return teaStallId;
}
public static void setName(String nm){
	name=nm;
}
public static String getName(){
	return name;
}
public static void setContactNo(long cn){
	contactNo=cn;
}
public static long getContactNo(){
	return contactNo;
}
public static void setBranch(String br){
	branch=br;
}
public static String getBranch(){
	return branch;
}

}