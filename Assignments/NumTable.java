/* 01.	Write a program to print table of any entered number using loop. */

import java.util.Scanner;

class NumTable{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num to prints it's multiplication table :");
		int num = sc.nextInt();
		int table;
		
		for(int i=1; i<=10; i++)
		{
			table = num *i;
			System.out.println(num+" * "+i+" = "+table);
		}
	}
}