package com.prowings.java.practice;

import java.util.Scanner;

public class CalculateAverage {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int m1,m2,m3,m4,m5,total,average;
	System.out.println("maths");
	m1=s.nextInt();
	System.out.println("science");
	m2=s.nextInt();
	System.out.println("history");
	m3=s.nextInt();
	System.out.println("geography");
	m4=s.nextInt();
	System.out.println("hindi");
	m5=s.nextInt();
	total=m1+m2+m3+m4+m5;
	System.out.println("total is:-"+total);
	average=total/5;
	System.out.println("average of total is:-"+average);
}
}
