package datastructure;

import java.util.Scanner;

public class Fibonacciseries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int f=0,s=1,t,count;
		
		System.out.println("enter count of fibonacci:");
		count=sc.nextInt();
		
		System.out.print(f+" "+s);
		
		for(int i=3;i<=count;i++)
		{
			t=f+s;
			System.out.print(" "+t);
			f=s;
			s=t;
		}
		
	}

}
