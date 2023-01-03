package datastructure;

import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		the given number is palindrome or not
		
		Scanner sc=new Scanner(System.in);
		
		int no1,no2,rem=0;
		System.out.println("enter the number:");
		no2=no1=sc.nextInt();
		
		while(no1>0){
			
			rem=(no1%10)+rem*10;
			no1=no1/10;
		}
		if(no2==rem){
			System.out.println("the given number is palindrome "+rem);
			
		}
		else
			System.out.println("the given number is not palindrome ");
	}

}
