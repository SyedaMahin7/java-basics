package com.xworkz.autowired2.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Value("syeda")
	private String name;
	@Value("female")
	private String gender;
	@Value("20")
	private int age;
	@Value("syeda")
	private String fathername;
	@Value("abc")
	private String mothername;
	@Value("ghost")
	private String sisterName;
	@Value("mehatab")
	private String brothername;
	@Value("ali")
	private String deadplace;
	@Value("hospet")
	private String type;
	@Value("23")
	private int ghostAdarnumber;
	private LocalDate date;
	
	private boolean isSuside;
	private String schhool;
	private String grandfather;
	private String grandMother;
	private String friendName;
	private String murderName;
	private String collegename;
	@Autowired
	public Ghost(@Qualifier("date")LocalDate date, @Qualifier("isSuside")boolean isSuside, @Qualifier("schhool")String schhool,@Qualifier("grandfather") String grandfather,@Qualifier("grandMother") String grandMother,
			@Qualifier("friendName")String friendName, @Qualifier("murderName")String murderName, @Qualifier("collegename")String collegename) {
		super();
		this.date = date;
		this.isSuside = isSuside;
		this.schhool = schhool;
		this.grandfather = grandfather;
		this.grandMother = grandMother;
		this.friendName = friendName;
		this.murderName = murderName;
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", age=" + age + ", fathername=" + fathername
				+ ", mothername=" + mothername + ", sisterName=" + sisterName + ", brothername=" + brothername
				+ ", deadplace=" + deadplace + ", type=" + type + ", ghostAdarnumber=" + ghostAdarnumber + ", date="
				+ date + ", isSuside=" + isSuside + ", schhool=" + schhool + ", grandfather=" + grandfather
				+ ", grandMother=" + grandMother + ", friendName=" + friendName + ", murderName=" + murderName
				+ ", collegename=" + collegename + "]";
	}
	
	
	
	

}
