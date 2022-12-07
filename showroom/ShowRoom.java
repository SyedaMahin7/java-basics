package com.xworkz.showroommanagement.showroom;
import com.xworkz.showroommanagement.manager.Manager;

public class ShowRoom {
	public Manager manager[];
	public int index;
	public Manager newManager[];
	
	public ShowRoom(int size) {
		manager=new Manager[size];
	}
	public boolean addManager(Manager managers) {
		boolean isManagerAdded=false;
		if(managers!=null) {
			System.out.println("manager name is added ");
			manager[index++]=managers;
			isManagerAdded=true;
		}
		return isManagerAdded;
		
	}
	public void readManager() {
		System.out.println("inside the readmanager method");
		for (int i= 0; i<manager.length; i++) {
			System.out.println(manager[i].getManagerName()+" "+manager[i].getAddress()+" "+manager[i].getAge()+" "+manager[i].getGender());
			
		}
		System.out.println("out of read manager method");
	}
	public void getManagerNameByName(String name) {
		System.out.println("inside the getmanagernamebyname");
		for (int i = 0; i < manager.length; i++) {
			if(manager[i].getManagerName().equals(name)) {
				System.out.println(manager[i].getManagerName()+" "+manager[i].getAddress()+" "+manager[i].getAge()+" "+manager[i].getGender());
				
				
			}
		}
	}
	public boolean updatednameByAddress(String name,String address) {
		System.out.println("insede update methods");
		boolean isUpdated=false;
		for (int i = 0; i < manager.length; i++) {
			if(manager[i].getManagerName().equals(name)) {
				System.out.println("name is matched");
				manager[i].setAddress(address);
				isUpdated=true;
			}
		}
		return isUpdated;
		
		
	}
	public boolean deleteManagerNameByName(String name) {
		boolean isDeleted=false;
		newManager=new Manager[manager.length-1];
		for(int i=0,k=0;i<manager.length;i++) {
			if(!manager[i].getManagerName().equals(name)) {
				System.out.println("pateint found");
				newManager[k++]=manager[i];
				isDeleted=true;
			}
		}
		return isDeleted;
		
		
	}
public void  getAllnewData() {
		
		System.out.println("inside read method");
		for(int j=0;j<newManager.length;j++) {
			System.out.println(this.newManager[j].getManagerName()+" "+this.newManager[j].getAddress()+" "+this.newManager[j].getAge()+" "+this.newManager[j].getGender());
			
		}
	}
	
	
}
