package Looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Miles2Km {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the miles");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		String input=br.readLine();
		double miles=Double.parseDouble(input);
		double kms=1.609*miles;
		System.out.println(kms);
		
	}

}
