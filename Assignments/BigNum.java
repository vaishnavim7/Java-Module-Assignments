/* 13.Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  
 */
 
 import java.util.Scanner;

class BigNum{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Enter three numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 == n2 && n1 == n3)
		{
			System.out.println(n1+" "+n2+" "+n3+" are equal");
		}
		else if(n1 > n2 && n1 > n3)
		{
			System.out.println(n1+" is  Greater than "+n2+" and "+n3);
		}
		else if(n2 > n1 && n2 > n3)
		{
			System.out.println(n2+" is  Greater than "+n1+" and "+n3);
		}
		else
		{
			System.out.println(n3+" is  Greater than "+n1+" and "+n2);
		}
	}
}