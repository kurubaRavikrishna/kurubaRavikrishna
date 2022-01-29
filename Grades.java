package com.programs.java;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
		int percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a percenage");
		percentage=sc.nextInt();
		if (percentage>=70)
		{
			System.out.println("you passed the exam in distinction");
		}
		else if (percentage>=60 && percentage<=69){
			
			System.out.println("you passed the exam in first class");
		}
		else if(percentage>=50 && percentage<=59) {
			System.out.println("you passed the exam in second class");
			
		}
		else if(percentage>=35 && percentage<=49) {
			System.out.println("you passed the exam in second class");
		}
		else if(percentage>=0 && percentage<=34) {
			System.out.println("you passed the exam in you failed the exam");
		}
		else {
			System.out.println("please enter the correct number");
		}
	}
	

}
