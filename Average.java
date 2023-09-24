package com.java.project;

import java.util.Scanner;

public class Average {
	
    public void avg(int a, int b, int c) {
    	int add = a+b+c;
    	int r = (add/3);
    	System.out.println("Average Number is:"+r);
    	
    }
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Average obj = new Average();
		
		System.out.print("Type first Number:");
		int firstNum = input.nextInt();
		
		System.out.print("Type Second Number:");
		int SecondNum = input.nextInt();
		
		System.out.print("Type Third Number:");
		int thirdNum = input.nextInt();
		
		obj.avg(firstNum, thirdNum, SecondNum);

	}

}
