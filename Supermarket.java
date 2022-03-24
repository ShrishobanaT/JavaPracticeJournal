public class Supermarket
{
static String Shop_name="Raja Supermarket";
static boolean offer=false;
String name;
int price;
char ch;
public static void main(String[] args)
{
Supermarket prod1=new Supermarket();
Supermarket prod2=new Supermarket();
Supermarket prod3=new Supermarket();
prod1.name="Soap";
prod1.price=10;
prod2.name="Shampoo";
prod2.price=20;
//Supermarket.giveoffer();// called by class name
//prod1.giveoffer();//called by object
//giveoffer();// called directly
//System.out.println(prod1.name);
//System.out.println(prod1.price);
//System.out.println(prod2.name);
//System.out.println(prod2.price);
//System.out.println(prod3.name);
//System.out.println(prod3.price);
//System.out.println(prod3.ch);
System.out.println(Supermarket.Shop_name);
System.out.println(Supermarket.offer);
Supermarket.offer=true;
System.out.println(Shop_name);
System.out.println(offer);
//Supermarket.giveoffer();
}
public static void giveoffer()
{
System.out.println("Tilbud");
}
}