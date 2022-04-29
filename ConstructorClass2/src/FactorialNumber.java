import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int no =sc.nextInt();
	     int Fact=1;
		for(int i=1;i<=no;i++)
		{
			Fact=Fact*i;
			System.out.println(Fact);
		}
	}

}
