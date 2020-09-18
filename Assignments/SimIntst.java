/* 08.Write a program to find the simple interest. 
Take the principle amount, rate of interest and time from user using Scanner class.
 */
 
import java.util.Scanner;

class SimIntst{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float p, r, t, si;
		
		System.out.println("Enter the Principal Rate and Time: ");
		p = sc.nextFloat();
		r = sc.nextFloat();
		t = sc.nextFloat();
		si = (p * r * t)/100;
		
		System.out.println("Simple Interest= "+si);
	}
}