
public class Swap_twonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap_twonos swap= new Swap_twonos();
		swap.swaptwonumbermethod();
	}

	private void swaptwonumbermethod() {
		// TODO Auto-generated method stub
		int num1=50;
		int num2=100;
		int num3=num1;
		System.out.println("Before Swap of two number values of Num1 & Num2 are");
		System.out.println(num1);
		System.out.println(num2);
		num1=num2;
		num2=num3;
		System.out.println("After Swap of two number values of Num1 & Num2 are");
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
