
public class Unaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unaryoperator u= new Unaryoperator();
		u.unaryincrementmethod();
		u.unarydecrementmethod();

	}

	private void unarydecrementmethod() {
		// TODO Auto-generated method stub
		int no=10;
		System.out.println(no-- + --no);
		System.out.println(no);
		
	}

	private void unaryincrementmethod() {
		// TODO Auto-generated method stub
		int no=10;
		System.out.println(no++ + ++no);
		System.out.println(no);
		System.out.println(no++);
		System.out.println(++no);
		System.out.println(no++ + ++no);
		int a=10, b=10;
		System.out.println(a++ + b++ + ++a + ++b);
		
	}

}
