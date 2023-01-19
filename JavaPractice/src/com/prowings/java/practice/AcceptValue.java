package com.prowings.java.practice;

import java.util.Scanner;

public class AcceptValue {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int z;
	System.out.println("enter value of X");
	int x=s.nextInt();
	System.out.println("enter value of Y");
	int y=s.nextInt();
	z=(4*x*x+5*y*y*y)/2*x*y;
	System.out.println("value of z" +z);
	
}
}
