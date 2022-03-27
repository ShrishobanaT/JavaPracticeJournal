class SquareCube
{
static int x=5;
static int y=5;
static int square(int x)
{
int A= x*x;
return A;
}
static int cube(int y)
{
int A= y*y*y;
return A;
}
public static void main(String[] args)
{
int s=square(x);
int c=cube(y);
System.out.println(s);
System.out.println(c);
}
}

