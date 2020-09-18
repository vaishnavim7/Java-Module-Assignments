/*06.Write a program that takes radius of a circle as input. 
Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle.
*/

import java.util.Scanner;

class AreaC{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float area;
		System.out.println("Enter the Radius of circle:");
		int radius = sc.nextInt();
		
		area = (float)(3.14 * (radius * radius));
		
		System.out.print("Area of circle: "+area);
		
	}
}