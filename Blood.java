package week01;

import java.util.Scanner;

public class Blood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("your age ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		System.out.println("enter weit");
		int weigt = scan.nextInt();
		if(age>=25 && weigt>=45)
		{
			System.out.println("eligible for blood donation");
			
		}
		else
		{
			System.out.println("ineligible for donation");
		}
	}
	

}
