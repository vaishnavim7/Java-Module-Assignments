/*04.	Write a program that initializes 2 byte type of variables. 
Add the values of these variables and store in a byte type of variable. 
[Note: primitive down casting is required in this program ] .
*/

class Dtype{
	public static void main(String args[])
	{	
		byte a = 40, b = 127, c; 
		c = (byte)(a + b);
		System.out.println("a = "+a+" b = "+b);
		System.out.println("sum of 2 byte type variables is c = "+c);
		
		
		/*
		byte d;
		int i = 130;
		d = (byte)i; //down casting 
		System.out.println("i = "+i);
		System.out.println("sum of 2 byte type variables is c = "+d);
		*/
		
		/*
		byte d;
		int i = 148;
		d = (byte)i;
		System.out.println("d = "+d);
		*/
		
		/*
		char i = 'A';
		int j;
		j = (int)i;  //upcasting
		System.out.println("j = "+j);
		*/
	
	}
}