package com.prowings.java.practice;

import java.util.Scanner;

public class AcceptValues {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter value 1");
	int x=s.nextInt();
	System.out.println("enter value 2");
	int y=s.nextInt();
	y=x;
	System.out.println(y);
	x=y;
	System.out.println(x);
}
}
