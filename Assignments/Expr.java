/*03.	Find the result of following expressions. 
You need to determine the primitive data type of the variable by looking carefully the given expression 
and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]*/


class Expr{
	public static void main(String args[])
	{
		/*
		int x = 7,y;
		y = x * x + 3 * x - 7;
		System.out.println("y = x2 + 3x - 7 => "+y);
		*/
		
		/*
		int x = 1, y = 0;
		System.out.println("x = "+x+" y = "+y);
		y = x++ + ++x;
	//	y = 1->2 + 2->3
	//  y =  2 + 3
		System.out.println("x = "+x+" y = "+y);
		*/
		
		/*
		int x=1,y=1,z=0;
		System.out.println("x = "+x+" y = "+y+" z = "+z);
	
		z = x++ - --y - --x  +  x++;
		// 1->2 - 1->0 - 2->1 + 1->2
		//	2 - 0 - 1 - 2
		//	2 - 3
		//	1
		
		System.out.println("x = "+x+" y = "+y+" z = "+z);
		*/
		
		/*
		boolean x = true,y = false;
		System.out.println("x = "+x+" y = "+y);
		boolean z = (x && y || !(x || y));
		System.out.println("z = "+z);
		*/
	}
}