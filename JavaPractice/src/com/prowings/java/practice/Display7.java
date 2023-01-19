package com.prowings.java.practice;

import java.util.Scanner;

public class Display7 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a,b,big;
	System.out.println("enter first number");
	a=s.nextInt();
	System.out.println("enter second number");
	b=s.nextInt();
	if(a>b)
	{   
		System.out.println("a is greater number"+a);	
	}
	else
	{
		System.out.println("b is smaller number"+b);		
	}

}
}
