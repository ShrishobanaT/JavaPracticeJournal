package Forloopsample1;

public class Starpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char z='a';z>='e';z++)
		{
		  for(char ch='z';ch>='a';ch--)
		  {
			System.out.print(ch);
		  }
		System.out.println();
		}
		for(int z1=1;z1<=4;z1++)
		{
		  for(int i=1;i<=5;i++)
		  {
			  if(i%2==0) {
			System.out.print("#");
		  }
			  else {
				  System.out.print("$");
			  }
		  }
		System.out.println();
		}	}

}
