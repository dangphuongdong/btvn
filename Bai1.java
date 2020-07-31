package baitapvenha;

import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
			int a,b,c ;
			
			Scanner scan= new Scanner(System.in);
			System.out.println("nhập vào số a");
			a=scan.nextInt();
			System.out.println("nhập vào số b");
			b=scan.nextInt();
			System.out.println("nhập vào số c");
			c=scan.nextInt();
			int delta= b*b-4*a*c;
			
			if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm!");
	            } else {
	                System.out.println("Phương trình có một nghiệm: "
	                        + "x = " + (-c / b));
	            }
	        }
	       
	        float x1;
	        float x2;
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
	    }
	}

	
