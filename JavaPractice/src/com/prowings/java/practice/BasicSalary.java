package com.prowings.java.practice;

import java.util.Scanner;

public class BasicSalary {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int basicSal;
	double netSal;
	double HRA=0.45;
	double TA=0.25;
	double DA=0.3;
	double MA=0.05;
	double PF=0.25;
	double allownces;
	System.out.println("enter basic salary amount");
	basicSal=s.nextInt();
	allownces=basicSal*HRA+TA+DA-MA-PF/100;
	System.out.println("Actual salary:-"+allownces);
	netSal=basicSal+allownces;
	System.out.println("Net salary:-"+netSal);
	
	
	
}
}
