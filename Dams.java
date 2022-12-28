package com.xworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Dams {
	
	public static void main(String[] args) {
		Collection <String> karnataka=new ArrayList<String>();
		karnataka.add("mom");
		karnataka.add(" tungabhadra");
		karnataka.add(" bhadra ");
		karnataka.add(" linganamakki");
		karnataka.add(" malapraba");
		karnataka.add("Raja lakhmagounda ");
		karnataka.add(" hemavathy");
		karnataka.add(" supadam");
		karnataka.add(" lakya dam");
		karnataka.add(" almatti ");
		System.out.println( "total no of dams in karnataka" +  karnataka.size());
		Collection <String> rajastan=new ArrayList<String>();
		rajastan.add("ranapratapSagar");
		rajastan.add("mahi baja sagar ");
		rajastan.add("bisalpur dam ");
		System.out.println( "total no of dams in rajastan" +  rajastan.size());
		Collection <String> andrapradesh=new ArrayList<String>();
		andrapradesh.add("Srisailam  ");
		andrapradesh.add("somasila  ");
		andrapradesh.add(" prakasam barrage");
		andrapradesh.add(" tatip[udi reservoir");
		andrapradesh.add(" gandipalem reservoir");
		andrapradesh.add(" ramagunden dam ");
		System.out.println( "total no of dams in andra pradesh" +  andrapradesh.size());
		Collection <String> telangana=new ArrayList<String>();
		telangana.add("nagarjuna sagar  ");
		telangana.add("Sri ram sagar ");
		telangana.add(" nizam sagar dam");
		telangana.add("dindi reservoir ");
		telangana.add("lower Manair dam ");
		telangana.add(" sigur dam");
		System.out.println( "total no of dams in telengana" +  telangana.size());
		
		Collection <String> bihar=new ArrayList<String>();
		bihar.add(" kohira ");
		bihar.add("nagi dam");
		System.out.println( "total no of dams in bihar" +  bihar.size());
		
		Collection <String> chattisgarh=new ArrayList<String>();
		chattisgarh.add(" HasdeoBango ");
		System.out.println( "total no of dams in chattisgarh" +  chattisgarh.size());
		
		Collection <String> gujarat=new ArrayList<String>();
		gujarat.add("Sardarsarovar dam ");
		gujarat.add("kadana dam ");
		gujarat.add(" karjan reservoir");
		System.out.println( "total no of dams in gujrat" +  gujarat.size());
		
		Collection <String> himachal=new ArrayList<String>();
		himachal.add(" Bhakra dam");
		himachal.add("the pong");
		himachal.add(" the chamera");
		System.out.println( "total no of dams in himachal" +  himachal.size());
		
		Collection <String> jammu=new ArrayList<String>();
		jammu.add(" salal dam");
		jammu.add(" baglihar dam");
		System.out.println( "total no of dams in jammu and kashmir" +  jammu.size());
		
		Collection <String> kerala=new ArrayList<String>();
		kerala.add(" kakki");
		kerala.add("the idukki ");
		kerala.add(" cheruthon ");
		kerala.add("kulamavu ");
		kerala.add("idamalayar ");
		System.out.println( "total no of dams in kerala" +  kerala.size());
		
		Collection <String> mp=new ArrayList<String>();
		mp.add("gandisagar");
		mp.add("tawa reservoir");
		mp.add("indirasagar");
		System.out.println( "total no of dams in mp" +  mp.size());
		
		Collection <String> maharastra=new ArrayList<String>();
		maharastra.add("koyna ");
		maharastra.add(" jayakwadi dam");
		maharastra.add("isapur dam ");
		maharastra.add(" totladoh ");
		maharastra.add("warna dam ");
		maharastra.add("mom  ");
		System.out.println( "total no of dams in maharastra" +  maharastra.size());
		
		Collection <String> odisha=new ArrayList<String>();
		odisha.add(" indravarti");
		odisha.add("jalaput  ");
		odisha.add("mandira dam ");
		System.out.println( "total no of dams in odisa" +  odisha.size());
		
		Collection <String> punjab=new ArrayList<String>();
		punjab.add(" ranjit sagar ");
		System.out.println( "total no of dams in punjab" +  punjab.size());
		
		Collection <String> taminnadu=new ArrayList<String>();
		taminnadu.add("mettur  ");
		taminnadu.add("solaiyar ");
		taminnadu.add("bhavanisagar ");
		System.out.println( "total no of dams in tamilnadu" +  taminnadu.size());
		
		Collection <String> uttarkhand=new ArrayList<String>();
		uttarkhand.add(" ramaganga");
		uttarkhand.add("jamrani ");
		uttarkhand.add(" tehri ");
		System.out.println( "total no of dams in uttarkhand" +  uttarkhand.size());
		
		Collection <String> up=new ArrayList<String>();
		up.add("rihand dam ");
		up.add(" matatilla dam");
		up.add("rajghat ");
		System.out.println( "total no of dams in up" +  up.size());
		
		Collection <String> westBengal=new ArrayList<String>();
		westBengal.add("mukutmanipur ");
		System.out.println( "total no of dams in up" +  westBengal.size());
		
		
		Collection <String> inIndia=new ArrayList<String>();
		inIndia.addAll(karnataka);
		inIndia.addAll(rajastan);
		inIndia.addAll(andrapradesh);
		inIndia.addAll(telangana);
		inIndia.addAll(bihar);
		inIndia.addAll(chattisgarh);
		inIndia.addAll(gujarat);
		inIndia.addAll(himachal);
		inIndia.addAll(jammu);
		inIndia.addAll(kerala);
		inIndia.addAll(mp);
		inIndia.addAll(maharastra);
		inIndia.addAll(odisha);
		inIndia.addAll(punjab);
		inIndia.addAll(taminnadu);
		inIndia.addAll(uttarkhand);
		inIndia.addAll(up);
		inIndia.addAll(westBengal);
		System.out.println("total no of dams in india" +inIndia.size());
		for(String ref:inIndia) {
			System.out.println(ref.toUpperCase());
		}
//		
//		for(String ref:inIndia) {
//			System.out.println(ref.toLowerCase());
//		}
//		
		
		Iterator<String> i=inIndia.iterator();
		while(i.hasNext()) {
			String ele=i.next();
			if(ele.startsWith("t")) {
				System.out.println("dams start with t " +ele);
			}
		}
		
		Iterator<String> s=inIndia.iterator();
		while(s.hasNext()) {
			String ele=s.next();
			if(ele.endsWith("ra")) {
				System.out.println("dams end with t " +ele);
			}
		}
		
		
		Iterator<String> r=inIndia.iterator();
		 while(r.hasNext()) {
			 String re=r.next();
			 if(re.equals("p")) {
				r.remove(); 
			 }
			 	 
		 }
		 System.out.println("after remove method"+ inIndia);

				for(String rev:inIndia) {
					
//					System.out.println(rev);
					StringBuilder ma=new StringBuilder(rev);
					ma.reverse();
					String reverse=ma.toString();
					
					if(rev.equals(reverse)) {
						System.out.println("string is palidrom"+rev);
					}
					else {
						System.out.println(" string is not palindromre");
					}
					
					
				}
		
		
		
		
	}

}
