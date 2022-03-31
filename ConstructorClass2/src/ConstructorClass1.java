
public class ConstructorClass1 {
static String name="Constructorname";
String buildit;//non-static value
int price,discount;//non-static value
	public ConstructorClass1(String buildit, int price, int discount) {
	// TODO Auto-generated constructor stub
		this.buildit= buildit;
		this.price = price;
		this.discount= discount;
		System.out.println("It automatically initiated");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			ConstructorClass1 Constructorobj=new ConstructorClass1("Constructorhome", 100, 200);
			System.out.println(Constructorobj.buildit);
			Constructorobj.show();
		}

	}
	private void show() {
		// TODO Auto-generated method stub
		System.out.println(buildit);
	}

}
