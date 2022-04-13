import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][]a=new int[3][3][2];
		Scanner Scan=new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{	
				for(int k=0;k<=a[i][j].length-1;k++)
				{		
			
			System.out.println("enter marks of " +(i+1) + " school " + (j+1) + " classroom " +(k+1) + " student ");
			a[i][j][k]=Scan.nextInt();
		}
		}
	}
		

		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{	
			
			System.out.println(a[i][j][k]);
			}
	}

	}

}
}