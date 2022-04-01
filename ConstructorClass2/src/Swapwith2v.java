
public class Swapwith2v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapwith2v sv=new Swapwith2v();
		sv.swap2v();		
	}

	private void swap2v() {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=200;
		System.out.println("Before swap two no:");
		System.out.println(num1);
		System.out.println(num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swap two no:");
		System.out.println(num1);
		System.out.println(num2);
	}

}
