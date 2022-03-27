public class Examplestatic
{
static int a=10;
void instancemethod()
{
System.out.println("This is called by instance object");;
}
static void staticmethod()
{
System.out.println("This is Static method");
}
public static void main(String[] args)
{
Examplestatic sc=new Examplestatic();
sc.instancemethod();
Examplestatic n=null;
n.staticmethod();
int c=n.a;
System.out.println(c);
}
}