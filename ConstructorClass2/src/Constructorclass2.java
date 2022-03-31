
public class Constructorclass2 {
static String name= "ConstructorHome";
String buildit1;
int price1,discount1;
public Constructorclass2(String buildit1, int price1, int discount1)
{
	 this("calledExplicit",2);
	 this.buildit1= buildit1;
	 this.price1=price1;
	 this.discount1=discount1;
	}
public Constructorclass2(String buildit1, int price1) {
	// TODO Auto-generated constructor stub
	this();
	this.buildit1=buildit1;
	this.price1=price1;
}

	public Constructorclass2() {
	// TODO Auto-generated constructor stub
		System.out.println("This is our default constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Constructorclass2 Constructorobj2= new Constructorclass2("ReadcopyofClass",20,30);
 Constructorclass2 Constructorobj3= new Constructorclass2("ReadcopyofClass",30);
 Constructorclass2 Constructorobj4= new Constructorclass2();
	}

}
