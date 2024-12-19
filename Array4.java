package gyana.pratice;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		int[] arr= {100,200,300,400,500};
		System.out.println("enter the index number to retive the value at that index:");
		int index=sc.nextInt(); 
		if(index>=0&&index<arr.length)System.out.println(arr[index]);
		else System.out.println("index out of bound");
		sc.close();
	}

}
