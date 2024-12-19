package gyana.pratice;
import java.util.Scanner;
public class Array5 {

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
		if(size%2==0)
		{
			int mid1=(size/2)-1;
			int mid2=size/2;
			System.out.println("First mid ele:"+arr[mid1]);
			System.out.println("second mid ele:"+arr[mid2]);
		}
		else
		{
			int mid=size/2;
			System.out.println("mid ele:"+arr[mid]);
		}
		sc.close();

	}

}
