package com.java.project;

import java.util.Scanner;

public class FindSmallestNum {

	
	public void min(int a, int b, int c) {
		if(a<b) {
			if(a<c) {
				System.out.println("Smallest Number is:"+ a);
			}else {
				System.out.println("Smallest Number is:"+ c);
			}
		}else {
			if (b<c) {
				System.out.println("Smallest Number is:"+ b);
			}else {
				System.out.println("Smallest Number is:"+ c);
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		FindSmallestNum obj = new FindSmallestNum();
		
		System.out.println("Type First Number:");
		int firstNum = input.nextInt();
		
		System.out.println("Type Second Number:");
		int secondNum = input.nextInt();
		
		System.out.println("Type Third Number:");
		int thirdNum = input.nextInt();
		
		obj.min(firstNum, thirdNum, secondNum);

	}

}
