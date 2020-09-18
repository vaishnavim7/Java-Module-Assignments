/* 15.	Accept person’s gender (character m for male and f for female), age (integer), 
as input and then check whether person is eligible for marriage or not.
*/

import java.util.Scanner;

class MEligible{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char gender;
		int age;
		
		System.out.println("Enter the gender and age: ");
		gender = sc.next().charAt(0);
		age = sc.nextInt();
		
		if( gender=='f' && age>=18 )
		{
			System.out.println("Female age is "+age+" yr eligible for marriage");
		}
		else if( gender=='m' && age>=21 )
		{
			System.out.println("Male age is "+age+" yr eligible for marriage");
		}
		else
		{
			System.out.println("age is "+age+" yr not eligible for marriage");
		}
	}
}