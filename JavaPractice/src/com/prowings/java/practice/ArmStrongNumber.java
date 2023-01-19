package com.prowings.java.practice;

import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num,c=0,r,arm=0;
	System.out.println("enter any number");
	num=s.nextInt();
	c=num;
	while(num>0)
	{
		r=num%10;
		arm=(r*r*r)+arm;
		num=num/10;
	}
	if(c==arm)
	{
		System.out.println("armstrong number");
	}
	else
		System.out.println("not armstrong number");
}
}