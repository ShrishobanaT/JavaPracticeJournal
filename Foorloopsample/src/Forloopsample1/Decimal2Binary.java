package Forloopsample1;

public class Decimal2Binary {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decimal2Binary D2B=new Decimal2Binary();
		//D2B.decimal_binary(10);
		D2B.decimal_binary1(12);
		
      }
	private void decimal_binary(int value)
	{
	while(value>0)
	{
	//value=value%2;
	System.out.print(value%2);
	value=value/2;
	}
	}
	private void decimal_binary1(int decimalno)
	{
	String binary="";
	while(decimalno>0)
	{
	binary=(decimalno%2)+binary;
	//binary=binary+(decimalno%2);
	decimalno=decimalno/2;
	}
	System.out.print(binary);
	}	
	}
	

		


