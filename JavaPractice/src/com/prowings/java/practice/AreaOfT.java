package com.prowings.java.practice;

import java.util.Scanner;

public class AreaOfT {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int b,h;
	double area;
	System.out.println("enter bridth");
	b=s.nextInt();
	System.out.println("enter height");
	h=s.nextInt();
	area=0.5*b*h;
	System.out.println("area of triangle:-"+area);
}
}
