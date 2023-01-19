package com.prowings.java.practice;

import java.util.Scanner;

public class AcceptNum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num;
	System.out.println("enter any number");
	num=s.nextInt();
	if(num>0)
	{
		System.out.println("positive number");
	}
	else
		System.out.println("Negative number");
}
}
