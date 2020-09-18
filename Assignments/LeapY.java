/* 14.Program to check that entered year is a leap year or not.*/

import java.util.Scanner;

class LeapY{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("Enter three numbers: ");
		year = sc.nextInt();
		
		if(year%100 == 0 && year%400 == 0)
		{
			System.out.println(year+" is Leap Year.");
		}
		else if(year%4 == 0)
		{
			System.out.println(year+" is Leap Year.");
		}
		else
		{
			System.out.println(year+" is not Leap Year.");
		}
	}
}