/* 11.Write a program to swap two numbers without using third variable.
 */
 
import java.util.Scanner;

class Swap{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter two num to swap: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Before Swap num1: "+num1+" num2: "+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swap num1: "+num1+" num2: "+num2);
	}
}
