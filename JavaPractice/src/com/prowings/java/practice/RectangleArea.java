package com.prowings.java.practice;

import java.util.Scanner;

public class RectangleArea {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int l,b,area;
	System.out.println("enter length");
	l=s.nextInt();
	System.out.println("enter bridth");
	b=s.nextInt();
	area=l*b;
	System.out.println("area of rectangle:-"+area);
	
}
}
