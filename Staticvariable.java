public class Staticvariable
{
static int variablevalue=100;//
public Staticvariable()
{
variablevalue++;
System.out.println(variablevalue);
}
public static void main(String[] args)
{
Staticvariable SV1=new Staticvariable();
Staticvariable SV2=new Staticvariable();
Staticvariable SV3=new Staticvariable();
}
}