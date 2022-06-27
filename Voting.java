package week01;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter te age of person");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a>-18)
		{
			System.out.println("te person is eligible");
			
		}
		else
		{
			System.out.println("te person is ineligible");
		}
	}
	

}
