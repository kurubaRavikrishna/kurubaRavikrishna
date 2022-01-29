package com.programs.java;
import java.util.Scanner;
public class Tables {
	public static void main(String [] args) {
		int a;
		int b;
		int d=0;
		Scanner c=new Scanner(System.in);
		
		System.out.println("enter first number");
		a=c.nextInt();
		//Scanner c=new Scanner(System.in);
		//System.out.println("enter second number");
		//b=c.nextInt();
		for (b=1;b<=10;b++) {
		 d=a*b;
		
		System.out.println(d);
		}
		
	}}


