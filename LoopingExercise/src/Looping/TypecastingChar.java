package Looping;

import java.io.IOException;

public class TypecastingChar {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		TypecastingChar.typecaste1();
		TypecastingChar.typecaste2();
	}
	public static void typecaste1()
	{
	  char ch='z';
	  int x=ch;
	    
	  System.out.println("Char value" +x);
	}
	public static void typecaste2() throws IOException 
	{
	  System.out.println("Enter the Character");
	  int x= System.in.read();
	  
	  System.out.println("Entered character value is"+x);
	}


}
