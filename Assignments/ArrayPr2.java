/* 07.	Sort a ten element array in descending order. */

import java.util.Scanner;

class ArrayPr2{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int temp;
		
		System.out.println("Enter the 5 elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Descending order: ");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
						

	}
}