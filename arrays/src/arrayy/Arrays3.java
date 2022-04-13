package arrayy;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a=new int[3][5];
		Scanner Scan=new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{	
			
			System.out.println("enter marks");
			a[i][j]=Scan.nextInt();
		}
		}
		System.out.println("the marks are");

		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
			
			System.out.println(a[i][j]);
			}
	}

}
}
