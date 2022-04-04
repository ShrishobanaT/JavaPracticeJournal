package Forloopsample1;
//Program to write print no using normal println,for loop, while loop.
public class OnetoTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    OnetoTen.print1to10();
    OnetoTen.print1to5();
    OnetoTen.print1to6();
	}
	public static void print1to10()
	{
		int i=1;
		System.out.println(i);
		i++;
		System.out.println(i);
		i++;
		System.out.println(i);
		i++;
		System.out.println(i);
		i++;
		System.out.println(i);
		i++;
		System.out.println();
	}
	public static void print1to5()
	{
		int i=1;
		while(i<=4)
		{
		System.out.println(i);
		i++;
		
	    }
		System.out.println();
    }
	public static void print1to6()
	{
		
		for(int i=1;i<=6;i++)
		{
		System.out.println(i);
	    }
    }
}

