package Forloopsample1;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int remainder=0;
   int num=123;
   int reversenum=0;
   while(num!=0)
   {
	   remainder=num%10;
	   num=num/10;
	   reversenum=(reversenum*10)+remainder;
	   
	   
   }
   System.out.println("reverse number is %d" +reversenum);
   
	}

}
