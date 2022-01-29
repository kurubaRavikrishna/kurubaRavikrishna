package com.programs.java;
import java.util.Scanner;
public class Divisibility {
	public static  void main (String [] args) {
		int num;
		System.out.println("enter a  number");
		
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	
	
	if (num % 5==0)
	{
		System.out.println("perfectly divisible");
		
	}
	else
	{
		System.out.println("not divisible");
		
	}
	
	}
}

