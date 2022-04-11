package Looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fahrenheit2Celsius {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter the Fahrenheit");
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		String input=br.readLine();
		double Fahrenheit=Double.parseDouble(input);
		double Celsuis=(Fahrenheit-32)*5/9;
		System.out.println(Celsuis);
		
		
	}

}

