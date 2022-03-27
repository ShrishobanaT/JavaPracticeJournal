
class staticvalue
{
static int x=100;
static int canchangevalue()
{
int x=200;
return x;
}
public static void main(String[] args)
{
int changedvalue=staticvalue.canchangevalue();
System.out.println(changedvalue);
}
}

