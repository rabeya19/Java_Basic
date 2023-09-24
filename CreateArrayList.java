package com.java.project;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> arrlist = new ArrayList<String>( ); 
		
		System.out.println("Initial Array List Size:"+ arrlist.size());
		
		arrlist.add("Rabeya");
		arrlist.add("Akter");
		arrlist.add("Mira");
		arrlist.remove(2);
		arrlist.add("Shahan");
		arrlist.set(0, "Ali");
		arrlist.set(0, "Mira");
		arrlist.add("Lamia");
		arrlist.add("Syama");
		arrlist.set(0, "Rabeya");
		arrlist.set(2, "Mira");
		
		System.out.println("New Array List Size:"+ arrlist.size());
	    
		for(int i=0; i<arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
        
	}

}
