package com.prowings.java.practice;

public class FibonancySeries {
public static void main(String[] args) {
	
	int a=0;
	int b=1;
	int c=0;
	for(int i=1;i<=5;i++)
	{
		c=a+b;
		b=a;
		c=b;
	}
	System.out.println(c);
}
}
