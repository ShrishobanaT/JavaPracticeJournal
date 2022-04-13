package Looping;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Typecasting.typecaste1();
		Typecasting.typecaste2();
	}
	public static void typecaste1()
	{
	  byte small=127;
	  int big;
	  big=small;
	  System.out.println("Big:"+big);
	}
	public static void typecaste2()
	{
	  int small1;
	  double big1=500;
	  small1=(int)big1;
	  
	  System.out.println("Small1:" +small1);
	}

}
