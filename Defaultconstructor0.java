public class Defaultconstructor0
{
static String Dcname="DefaultConstructor0";
int Dcvalue1;
double Dcvalue2;
public Defaultconstructor0(String Dcname,int Dcvalue1,double DCvalue2)
{
this.Dcname=Dcname;
this.Dcvalue1=Dcvalue1;
this.Dcvalue2=Dcvalue2;
System.out.println(Dcname);
System.out.println(Dcvalue1);
System.out.println(Dcvalue2);
}
public static void main(String[] args)
{
Defaultconstructor0 DC=new Defaultconstructor0("ABCD",2,3.0);
//DC.Calldefaultconstructor();
}
}