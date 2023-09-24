package com.java.project;

import java.util.Scanner;

public class MathOperations {
    public void add(int a, int b) {
    	int s = a+b;
    	System.out.println("Summation is: "+s);
    }
    public void sub(int a, int b) {
    	int s = a-b;
    	System.out.println("Subtraction is: "+s);
    }
    public void mul(int a, int b) {
    	int m = a*b;
    	System.out.println("Multiplication is: "+m);
    }
    public void div(int a, int b) {
    	float d = a/b;
    	System.out.println("Divition is: "+d);
    }
    public void rem(int a, int b) {
    	int r = a%b;
    	System.out.println("Remainder is: "+r);
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		MathOperations obj = new MathOperations();
		
		System.out.println("Type the First Number:");
		int a = input.nextInt();		
		
		System.out.println("Type the Second Number:");
		int b = input.nextInt();
		
		obj.add(a, b);
		obj.sub(a, b);
		obj.mul(a, b);
		obj.div(a, b);
		obj.rem(a, b);
	}

}
