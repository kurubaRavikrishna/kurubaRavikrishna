package com.programs.java;
import java.util.Scanner;
public class ArithmaticCalculator {
	public static void main(String[] args) {
		int a;
		int b;
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number");
		a=sc.nextInt();
		Scanner c=new Scanner(System.in);
		System.out.println("enter a second number");
		b=c.nextInt();
		Scanner d=new Scanner(System.in);
		System.out.println("choice an operation");
		choice=d.nextInt();
		
		if (choice==1) {
		System.out.println("result is"+(a+b));
		}
		else if(choice==2) {
			System.out.println("result is "+(a-b));
		}
		else if(choice==3) {
			System.out.println("result is"+(a*b));
		}
		else if(choice==4) {
			System.out.println("result is "+(a/b));
		}
		else {
				System.out.println("enter a correct choice");
		}
			
		
		
	}
	

}
