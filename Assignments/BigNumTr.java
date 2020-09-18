/* 13.Program to find greatest in 3 numbers. 
[ once using if else statement and then using ternary operator ( logical operator) ]  
 */

import java.util.Scanner;
//ternary operator and logical operator
class BigNumTr{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, gr;
		
		System.out.println("Enter three numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		//boolean num1 = (n1>n2 && n1>n3); 
		//boolean num2 = (n2>n1 && n2>n3); 
		//boolean num3 = (n3>n1 && n3>n2);
		
		gr = (n1 > n2 && n1 > n3) ?  n1 :  ((n2 > n3 && n2 > n1) ?  n2 :  ((n3 > n1 && n3 > n2) ? n3 : n2)); 
		
		System.out.println("Greatest num between "+n1+" "+n2+" "+n3+" is "+gr);
		
	}
}