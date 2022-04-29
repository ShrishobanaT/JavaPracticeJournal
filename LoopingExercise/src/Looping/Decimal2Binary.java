package Looping;

import java.util.Scanner;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Decimal2Binary d2b=new Decimal2Binary();
			Scanner sc=new Scanner(System.in);
			System.out.println("Decimal no");
		
			int s=sc.nextInt();
			d2b.Dec2Bin(s);
			d2b.Dec2Bin2();
			d2b.Dec2Bin3();
			
	}

	private void Dec2Bin3() {
		// TODO Auto-generated method stub
		int no=8;
		System.out.println(Integer.toBinaryString(no));
	}

	private void Dec2Bin2() {
		// TODO Auto-generated method stub
		System.out.println("Enter the decimal no:");
		Scanner sc=new Scanner(System.in);
	
		int decimalnum=sc.nextInt();
		StringBuffer binary= new StringBuffer();
		while(decimalnum!=0)
		{
			int digit=(decimalnum%2);
			binary.append(digit);
			decimalnum=decimalnum/2;
			
		}
		binary.reverse();
		System.out.println(binary);
		
	}

	private void Dec2Bin(int decimalno) {
		// TODO Auto-generated method stub
		String binary="";
		while(decimalno!=0)
		{
			binary=(decimalno%2)+binary;
			decimalno=decimalno/2;
		}
		System.out.println(binary);
	}

}
