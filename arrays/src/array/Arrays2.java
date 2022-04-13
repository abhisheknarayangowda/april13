package array;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int[3];
		Scanner Scan=new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)           //USING LENGTH VARIABLES
		{
			System.out.println("enter marks");
			a[i]=Scan.nextInt();
			
		}
		System.out.println("the marks are");

		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
			}
	}

}
