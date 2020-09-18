/*07.Write a program to calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks from user using Scanner class. 
Output should be in this format [ percentage marks = 99 % ]. 
Use concatenation operator here.
*/

import java.util.Scanner;

class ConcatOp{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m1, m2, m3, m4, m5, sum;
		double avg;
		
		System.out.println("Enter the Marks of 5 Subjects: ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		
		sum = (m1 + m2 + m3 + m4 + m5);
		
		avg = (sum / 5);
		
		System.out.print("Percentage Marks= "+avg+"%");
	}
}