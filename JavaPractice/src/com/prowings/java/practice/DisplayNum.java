package com.prowings.java.practice;

import java.util.Scanner;

public class DisplayNum {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int x,y,z;
	System.out.println("enter value of x");
	x=s.nextInt();
	System.out.println("enter value of y");
	y=s.nextInt();
	System.out.println("enter value of z");
	z=s.nextInt();
	if(x>y && x>z)
	{
		System.out.println("x is largest number"+x);
	}
	else if(y>x && y>z)
	{
		System.out.println("y is largest number"+y);
	
	}
	else if(z>x && z>y)
	{
		System.out.println("z is largest number"+z);
		
	}
	else
		System.out.println("x y z are equal");
	
}
}
