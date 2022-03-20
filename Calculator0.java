public class Calculator0
{
public static void main(String[] args)
{
Calculator0 calc= new Calculator0();
 float add_result= calc.add(100,105.0f);// int values
System.out.println(add_result);
calc.sub(add_result);
//add-input-arguments-parameter
}
//calc.add(100,101);// inputs--:arguments--parameter
// call by values


//}//javac calculator.java

public float add(int n1, float n2)
{
//System.out.println(n1+n2);
return n1+n2;
//System.out.println(n1+n2);
}
public void sub(float f)
{
System.out.println("Hello");
}
}
