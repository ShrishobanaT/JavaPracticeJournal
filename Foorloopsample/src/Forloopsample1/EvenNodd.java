package Forloopsample1;

import java.util.Scanner;

public class EvenNodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EvenNodd Evenodd=new EvenNodd();
    Evenodd.even2();
   // Evenodd.even();
   // Evenodd.even1();
	}
	public void even2()
	{
		for(int Num=2;Num<=20;Num+=2)
		{
			System.out.println(Num+ "  " +Num*Num+ "  " +Num*Num*Num);
			
			
		}
	}
	public void even()
	{
		for(int Num=1;Num<=10;Num++)
		{
			if(Num%2==0)
			System.out.println("Even Numbers:" +Num);
		}
	}
	public void even1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int Num=sc.nextInt();
		//for(Num=1;Num<=10;Num++)
		//{
			if(Num%2==0) {
			System.out.println("Even Numbers:" +Num);
			}
			else if (Num%2==1)
			{
				System.out.println("Odd Numbers:" +Num);
			}

		//}
	}
}
