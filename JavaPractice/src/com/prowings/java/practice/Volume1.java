package com.prowings.java.practice;

import java.util.Scanner;

public class Volume1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int l,b,h,v;
	System.out.println("enter length");
	l=s.nextInt();
	System.out.println("enter bridth");
	b=s.nextInt();
	System.out.println("enter height");
	h=s.nextInt();
	v=l*b*h;
	System.out.println("volume of box:-"+v);
}
}
