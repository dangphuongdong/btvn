package baitapvenha;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args)
	{
		System.out.println("các số chia hết cho 7 nhưng không chia hết cho 5 la:");
		for(int i=20;i<200;i++)
		{
			if(i % 7==0 && i%5 !=0)
				System.out.println(i);
		}
		
	}
	
}
