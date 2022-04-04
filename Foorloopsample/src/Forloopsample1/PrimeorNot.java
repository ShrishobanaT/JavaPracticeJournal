package Forloopsample1;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PrimeorNot prime=new PrimeorNot();
    prime.primemethod();
    prime.prime1();
	}
	  public void primemethod()
	   {
		  int num=7;
		  int count=0;
		  for(int i=1;i<=num;i++){
			  if(num%i==0){
				  count++;
			  }
		  }
		  if(count==2)
		  {
			  System.out.println("prime");
		  } 
		  else
		  {
			  System.out.println("not prime");
		  }
	   }
	  public void prime1()
	  {
		  int i=0;
		  int value=10;
		  for(int num=1;num<=value;num++)
		  {
			  if(value%num==0)
			  i++;
		  }
		 if(i==2)
		 {
			 System.out.println("prime");
		 }
		 else
		 {
			 System.out.println("not prime");
		 }
			 
	  }
	  
}
