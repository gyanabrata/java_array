package gyana.pratice;
import java.util.*;
public class Array3
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
