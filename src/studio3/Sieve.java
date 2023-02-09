package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the value of n");
		int n = in.nextInt();
		int[] values=new int [n];
		for ( int i = 0; i < values.length; i++) 
		{values [i]=i;
		
		}
		for (int i=2; i< values.length ;i++)
		{
			for(int p=2; p <= (n-1)/i; p++)
			{
				int v = i * p;
				values [v] = 1;
			}


			

		}
		for (int i=2; i<values.length; i++)
		{
		if (values[i]!=1)
		{
			System.out.println(values[i]);
		}
		}
	
	}
}


