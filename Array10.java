package gyana.pratice;

import java.util.Scanner;

public class Array10 
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
		System.out.println("array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("array elements are in reverse order:");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
