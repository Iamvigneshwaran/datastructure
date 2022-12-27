import java.util.Scanner;
public class Arraydeletion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
		//int size=5;
		int[] arr=new int[5];
		System.out.println("enter the array element ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the location you want to delete:");
		int location=sc.nextInt();
		location=location-1;
		
		for(int i=location;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
