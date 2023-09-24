package com.java.project;

import java.util.Scanner;

public class MathOperationsCopy {

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
