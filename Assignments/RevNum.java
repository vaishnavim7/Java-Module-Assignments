/* 02.	Write a program to reverse a given number. */

import java.util.Scanner;

class RevNum{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num for reverse:");
		int num = sc.nextInt();
		
		int rev = 0, rem = 0;
		
		while(num != 0)
		{
			rem = (num % 10);
			rev = ((rev * 10) + rem);
			num = (num / 10);
		}
		System.out.println("Reverse of "+num+" is "+rev);
	}
	
}