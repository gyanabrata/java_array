package gyana.pratice;

import java.util.*;
class Array2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:" );
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter "+size+" numbers:" );
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
		
	}
}
