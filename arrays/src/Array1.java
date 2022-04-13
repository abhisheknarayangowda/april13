import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a=new int[5];
Scanner Scan=new Scanner(System.in);
for(int i=0;i<=4;i++)                         // HARDCODE
{
	System.out.println("enter marks");
	a[i]=Scan.nextInt();
	
}
System.out.println("the marks are");

for(int i=0;i<=4;i++)
{
	System.out.println(a[i]);
	}

}
}