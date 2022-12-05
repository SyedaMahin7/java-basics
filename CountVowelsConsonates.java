package com.xworkz.interview;

import java.util.Scanner;

public class CountVowelsConsonates {
	 public static void main(String[] args) {
	      int vowels_count, consonants_count;
	      String my_str;
	      vowels_count = 0;
	      consonants_count = 0;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("A scanner object has been defined ");
	      System.out.print("Enter a statement: ");
	      my_str = scanner.nextLine();
	      my_str = my_str.toLowerCase();
	      for (int i = 0; i < my_str.length(); ++i) {
	         char ch = my_str.charAt(i);
	         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            ++vowels_count;
	         }
	         else 
	         if ((ch >= 'a' && ch <= 'z')) {
	            ++consonants_count;
	         }
	      }
	      System.out.println("The number of vowels in the statement is: " + vowels_count);
	      System.out.println("The number of vowels in the Consonants is: " + consonants_count);
	   }

}
