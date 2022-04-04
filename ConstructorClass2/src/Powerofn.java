//Power of n numbers
public class Powerofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Powerofn p=new Powerofn();
		p.power1();
		p.Powofnum();
		
	}
		public void power1()
		{
		
		int value=512,count=0;
		while(value>0)
		{
		System.out.println("Power" +value/2);
		value=value/2;
		count++;
		System.out.println("count:" +count);
		
		int count1=7;
		int value1=1;
		while(count1>0)
		{
		value1=value1*2;
		count1--;
		System.out.println("value" +value1);
		}		
		}
		}
	
	public void Powofnum()
	{
		int base=2;
		int exponent=5;
		int result=1;
		while(exponent>0)
		{
			result=result*base;
			exponent--;
		}
		System.out.println("REsult" +result);
	}

}
