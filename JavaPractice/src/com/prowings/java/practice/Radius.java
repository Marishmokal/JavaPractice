package com.prowings.java.practice;

import java.util.Scanner;

public class Radius {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double circumference;
		double area;
		double pi=3.14;
		int r;
		System.out.println("enter radius");
		r = s.nextInt();
		area = pi*r*r;
		System.out.println("area of circle:-" + area);
		circumference = 2*pi*r;
		System.out.println("circumference of circle:-" + circumference);

	}
}
