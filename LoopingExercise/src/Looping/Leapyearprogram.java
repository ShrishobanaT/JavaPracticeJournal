package Looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leapyearprogram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Year");
		int year=Integer.parseInt(reader.readLine());
		
      if(year%4==0)
      {
    	  System.out.println("It is Leap year");
      }
      else
      {
    	  System.out.println("It is not Leap year");  
      }
	}

}
