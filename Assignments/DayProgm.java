/*09.Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
Now convert the entered days into complete years, months and days and print them.
*/

import java.util.Scanner;

class DayProgm{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int days, months, weeks, years;
		
		System.out.println("Enter the number of days: ");
		days = sc.nextInt();
		
		years = days/365;
		
		months = (days%365)/30;
		
		weeks = (days%365)/7;
		
		days = (days%365)%7;

		System.out.println(years+" year "+months+" months "+weeks+" weeks "+days+" days.");
	}
}