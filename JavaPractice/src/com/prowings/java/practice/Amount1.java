package com.prowings.java.practice;

import java.util.Scanner;

public class Amount1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int gstAmt;
	int netAmt;
	int billAmt;
	System.out.println("enter bill amount");
	billAmt=s.nextInt();
	gstAmt=billAmt*18/100;
	System.out.println("Gst amount:-"+gstAmt);
	netAmt=billAmt+gstAmt;
	System.out.println("Net amount:-"+netAmt);
	
}
}
