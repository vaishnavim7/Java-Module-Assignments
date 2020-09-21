/* 03.	Program to check whether number is prime or not. */

import java.util.Scanner;

class PrimeNum{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				System.out.println(num+" is not prime num");
				break;
			}
			else{
				System.out.println(num+" is prime num");
				break;
			}
		}
		
	}
	
}