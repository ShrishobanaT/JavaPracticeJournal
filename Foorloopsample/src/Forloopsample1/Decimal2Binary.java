package Forloopsample1;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=9, r;
      String binaryout="";
      while(n<0)
      {
    	  r=n%2;
    	  binaryout=r+binaryout;
    	  n=n/2;
    	  //System.out.println(n);
    	     	  
      }
      System.out.println(binaryout);
      }
	}


