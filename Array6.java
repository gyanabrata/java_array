package gyana.pratice;

import java.util.Scanner;

public class Array6 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter "+size+" elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(size>0)
		{
			int sum=arr[0]+arr[size-1];
			System.out.println("the sum of first and last element:"+sum);
		}
		else System.out.println("array is empty");
		sc.close();
	}

}
