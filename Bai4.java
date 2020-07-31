package baitapvenha;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args)
	{
		System.out.println("nhập số N:");
		int n;
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("Các số nguyên tố trong khoản từ 1 đến"+n);
		for(int i=2;i<n;i++)
		{
			int dem=0;
			for(int j=1;j<= Math.sqrt(i);j++)
			if(i%j==0)
				dem++;
			if(dem==1)
			{
				System.out.println(i);
			}
			
		}
		
	}
	
}
