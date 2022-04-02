
public class Whileloop1 {

	public static void main(String[] args) {
		int Num=1234;
		int Num2=Num;
		//decimal no && /, %, operator.
		int reminder=0;
		while(Num>0)
		{
		reminder=(reminder*10)+Num%10;
		Num=Num/10;
		}
		System.out.println("Num" +Num);
		System.out.println(reminder);
		if(reminder==Num2)
			System.out.println("Yeah it is palindrome");
		else
			System.out.println("No");
		
		
	}
}
	
	


	
	



