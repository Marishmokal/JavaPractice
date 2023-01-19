package com.prowings.java.practice;

public class Test45 implements Cloneable
{
	int i=10;
	int j=20;
public static void main(String[] args)throws CloneNotSupportedException 
{
Test45 t1=new Test45();
Test45 t2=(Test45)t1.clone();
t2.i=888;
t2.j=999;
System.out.println(t1.i+" "+t1.j);

}
}
