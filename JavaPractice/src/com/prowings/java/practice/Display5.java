package com.prowings.java.practice;

import java.util.Scanner;

public class Display5 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		if(num>0)
		{
			System.out.println("positive number");
		}
		else if(num<=0)
			System.out.println("negative number");
	}
	
}
}
