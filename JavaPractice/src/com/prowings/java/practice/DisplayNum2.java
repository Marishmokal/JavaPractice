package com.prowings.java.practice;

import java.util.Scanner;

public class DisplayNum2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int w,x,y,z;
	System.out.println("enter value of W");
	w=s.nextInt();
	System.out.println("enter value of X");
	x=s.nextInt();
	System.out.println("enter value of Y");
	y=s.nextInt();
	System.out.println("enter value of Z");
	z=s.nextInt();
	if(w<x && w<y && w<z)
	{
		System.out.println("w is smaller number"+w);
	}
	else if(x<w && x<y && x<z)
	{
		System.out.println("x is smaller number"+x);
	}
	else if(y<w && y<x && y<z)
	{
		System.out.println("y is smaller than"+y);
	}
	else if(z<w && z<x && z<y)
	{
		System.out.println("z is smaller than"+z);
	}
	else
		System.out.println("w x y z are equal");
}
}
