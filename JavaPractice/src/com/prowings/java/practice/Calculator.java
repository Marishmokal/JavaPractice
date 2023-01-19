package com.prowings.java.practice;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
Scanner s =new Scanner(System.in);
int num,a,b,c=0;

System.out.println("enter a");
a=s.nextInt();
System.out.println("enter b");
b=s.nextInt();
System.out.println("enter any number");
num=s.nextInt();
switch(num)
{
case 1:
	c=a+b;
	System.out.println("addition" +c);
	break;
case 2:
	c=a-b;
	System.out.println("substraction" +c);
	break;
case 3:
	c=a*b;
	System.out.println("multiplication" +c);
	break;
case 4:
	c=a/b;
	System.out.println("division" +c);
	break;
default:
	System.out.println("not valid" +c);
}

}
}
