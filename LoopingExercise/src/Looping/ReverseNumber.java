package Looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
     ReverseNumber RN=new ReverseNumber();
     RN.Reversemethod();
     RN.palindromethod();
	}

	private void palindromethod() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number");
		int getno=Integer.parseInt(reader.readLine());
		StringBuffer b=new StringBuffer(getno+"");
		b.reverse();
		String x=b.toString();
		int rev=Integer.parseInt(x);
		if(getno==rev)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
				
	}

	private void Reversemethod() {
		// TODO Auto-generated method stub
	
		System.out.println("Enter the number");
		Scanner no= new Scanner(System.in);
		int digit=no.nextInt();
		int sum=0;
		while(digit!=0)
		{
			int temp=digit%10;
			System.out.print(temp);
			sum=sum+temp;
			digit=digit/10;
		}
		System.out.println("\n" +sum);
	}

}
