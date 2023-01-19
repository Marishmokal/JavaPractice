package com.prowings.java.practice;

import java.util.Scanner;

public class Addition12 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1,n2,sum;
	System.out.println("enter first value");
	n1=s.nextInt();
	System.out.println("enter Second value");
	n2=s.nextInt();
	sum=n1+n2;
	System.out.println("Addition is:-"+sum);
}
}
