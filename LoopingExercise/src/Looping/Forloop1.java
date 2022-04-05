package Looping;

public class Forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forloop1 loop=new Forloop1();
		loop.forlooppattern();
		loop.forlooppattern1();
		loop.forlooppattern2();

	}
	public void forlooppattern()
	{
	int col =1; int val = 0;
	for(int row=5; row>0; row--)
	{
	val = val + row; 
	for(;col<=val;col++){
	System.out.print(col+" "); 
	}
	System.out.println(); 
	}
	}
	public void forlooppattern1()
	{
	for(int row =5; row>0; row--)
	{
	for(int col=1; col<=row; col++)
	{
	System.out.print("* "); 
	} 
	System.out.println();
	}
	}
	public void forlooppattern2()
	{
	int no = 1;
	for(int row =5; row>0; row--)
	{
	for(int col=1; col<=row; col++)
	{
	System.out.print(no+ " "); 
	no++; 
	} 
	System.out.println();
	}
	}
}
