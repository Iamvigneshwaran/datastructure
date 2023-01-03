package datastructure;

import java.util.Scanner;

public class Reversenumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int no,rem;
      System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
	
		while(no>0){
		rem=no%10;
		System.out.print(rem);
		no=no/10;
		}
	}

}
