package gyana.pratice;

import java.util.Scanner;

public class Array9 {

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
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		double avg=(double)sum/size;
		System.out.println("Avg of array elements:"+avg);
		sc.close();
	}
}
