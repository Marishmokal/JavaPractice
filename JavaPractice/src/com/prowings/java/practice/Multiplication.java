package com.prowings.java.practice;

import java.util.Scanner;

public class Multiplication {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1,n2,n3,total;
	System.out.println("Enter First Value");
	n1=s.nextInt();
	System.out.println("Enter Second Value");
	n2=s.nextInt();
	System.out.println("Enter Third Value");
	n3=s.nextInt();
	total=n1*n2*n3;
	System.out.println("total is:-"+total);
}
}
