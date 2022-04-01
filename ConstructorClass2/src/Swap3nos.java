
public class Swap3nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap3nos S3 = new Swap3nos();
		S3.swap3();
	}

	private void swap3() {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=200;
		int num3=300;
		System.out.println("Before swap 3 no:");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		num1=num3-num1;
		num3=num3-num2;
		num2=num1+num3;
		System.out.println("After swap 3 no:");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
