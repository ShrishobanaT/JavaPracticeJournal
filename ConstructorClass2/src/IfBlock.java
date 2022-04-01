
public class IfBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		if(num1>num2)
		{
			System.out.println(num1);
		}
		else
		{
			System.out.println(num2);
		}
		
		int n1=10,n2=20,n3=30;
		if((n1>n2)&&(n1>n3))
			System.out.println(n1);
		else if ((n2>n1)&&(n2>n3))
			System.out.println(n2);
		else if ((n3>n1)&&(n3>n2))
			System.out.println(n3);
		
		int a=10,b=12;
				int c=a>b?a:b;
				System.out.println(c);	
		}

}
