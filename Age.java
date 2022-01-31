package com.programs.java;
import java.util.Scanner;
public class Age {
	public static  void main (String [] args) {
		int age;
		System.out.println("enter a  number");
		
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();
	
	
	if (age>=18)
	{
		System.out.println("you can vote");
		
	}
	else
	{
		System.out.println("your age is below 18 years");
		
	}
	
	}
}


