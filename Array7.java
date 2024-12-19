package gyana.pratice;

import java.util.Scanner;

public class Array7 
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
		System.out.print("even elements are:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("odd elements are:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
