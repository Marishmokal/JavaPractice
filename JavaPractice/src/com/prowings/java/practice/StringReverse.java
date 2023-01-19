package com.prowings.java.practice;

public class StringReverse {
public static void main(String[] args) {
	String s="MARISH";
	char []c=s.toCharArray();
	System.out.println(c);
	for(int i=c.length-1;i>=0;i--)
	{
		System.out.print(c[i]);
	
	}
}
}
