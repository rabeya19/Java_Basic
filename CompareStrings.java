package com.java.project;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type the First String:");
		String a = input.next();
		
		System.out.println("Type the Second String:");
		String b = input.next();
		
		if(a.equals(b)) {
			System.out.println(a +" == "+ b);
		}
		else {
			System.out.println(a +" != "+ b);
		}
		

	}

}
