/*12.In a company an employee is paid as under: If his basic salary is less than Rs. 10000, 
then HRA = 10% of basic salary and DA = 90% of basic salary. 
If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
If the employee's salary is input by the user write a program to find his gross salary. 
[ formula : GS= Basic + DA + HRA ]
*/

import java.util.Scanner;

class Gsal{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float bsal, da, hra, gs;
		
		System.out.println("Enter The Basic Salary: ");
		bsal = sc.nextFloat();
		
		if(bsal < 10000)
		{
			da = bsal * 10 / 100;
			hra = bsal * 90 / 100;
			gs = bsal + da + hra;
			System.out.println("Basic sal is "+bsal+" HRA is "+hra+" DA is "+da+" Gross Salary is "+gs);
		}
		else if(bsal >= 10000)
		{
			da = bsal * 98 / 100;
			hra = 2000;
			gs = bsal + da + hra;
			System.out.println("Basic sal is "+bsal+" HRA is "+hra+" DA is "+da+" Gross Salary is "+gs);
		}
	}
}
