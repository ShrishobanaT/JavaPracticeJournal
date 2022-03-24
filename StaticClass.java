public class StaticClass{

//Constructor
public StaticClass()
{
System.out.println("Constructor");
}

// Non-static block
 {
System.out.println("Non-static Block");
 }

// Static block
 static
 {
 System.out.println("Static Block");
 }

public static void main(String[] args)
{

System.out.println("Main Method");
StaticClass SC=new StaticClass();
StaticClass.Staticmethod();
}
//Static Method
 public static void Staticmethod()
 {
 System.out.println("Static Method");
 }

}

