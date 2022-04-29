import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Enter the Number");
   Scanner sc= new Scanner(System.in);
   int no=sc.nextInt();
   for(int i=1;i<=no;i++)
   {
	   double result=no/i;
	   System.out.println(result+ "" +Math.ceil(result));
   }
		
		
	}

}
