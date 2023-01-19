package com.prowings.java.practice;

import java.util.Scanner;

public class Reverse1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number");
	int num=s.nextInt();
	int reverse=0;
	for(int i=0;num!=0;i++) 
	{
		reverse=reverse*10+num%10;
		num=num/10;
	}
	System.out.println(reverse);
}
}
