package datastructure;

import java.util.Scanner;
public class Decimal_to_binary {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary="";
		int rem,decimal;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the decimal number: ");
		decimal=sc.nextInt();

		while(decimal>0){
		rem=decimal%2;
		binary=rem+binary;
		decimal=decimal/2;
		}
		System.out.println("Binary number :"+binary);
	}

}
