package com.programs.java;
import java.util.Scanner;
public class EvenOrOdd {
	public static  void main (String [] args) {
		int num;
		System.out.println("enter a  number");
		
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	
	
	if (num % 2==0)
	{
		System.out.println("it is a even number");
		
	}
	else
	{
		System.out.println("it is odd number");
		
	}
	
	}
}
