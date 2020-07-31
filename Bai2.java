package baitapvenha;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		int a;
		System.out.println("nhập vào số a");
		
		Scanner scan= new Scanner(System.in);
		a=scan.nextInt();
		int tich=1;
	
		for(int i=2;i<=a;i++)
		{
			tich*=i;
		}
		System.out.println("giai thừa số a là:" + tich);
	}
	
}
