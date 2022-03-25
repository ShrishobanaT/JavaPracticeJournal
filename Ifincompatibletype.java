public class ifincompatibletype
{
public static void main(String[] args)
{
int x=0;
if(x)
{
System.out.println("Hello");
}
else
{
System.out.println("Hi");
}
}
}
//incompatible types: int cannot be converted to boolean
if(x)