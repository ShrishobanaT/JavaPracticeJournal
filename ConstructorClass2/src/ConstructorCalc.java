
public class ConstructorCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorCalc calc=new ConstructorCalc();
calc.add(10,20);
calc.add(10,20,30);
calc.add(10,15.5f);
calc.add(15.2f,2);
	}

	private void add(float f, int f2) {
		// TODO Auto-generated method stub
		System.out.println(f+f2);
	}

	public void add(int i, float f) {
		// TODO Auto-generated method stub
		System.out.println(i+f);
	}

	private void add(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println(i+j+k);
	}

	private void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+j);
	}
	

}
