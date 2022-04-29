package Looping;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Binary2DecOct {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      Binary2DecOct b2d=new Binary2DecOct();
      b2d.binary2dec();
      b2d.binary2decI();
      
	}

	private void binary2decI() {
		// TODO Auto-generated method stub
		int no=0b111;
		System.out.println(no);
	}

	private void binary2dec() throws Exception {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Binary value");
		int Value=Integer.parseInt(sc.readLine(), 2);
		
		System.out.println(Value);
		
	}

}
