
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = {1,2,3,4,5};
    for(int i=0;i<a.length;i++)
    {
    	System.out.print(a[i]+" ");
    }
    System.out.println();
    int sum=0, avg;
    for(int i=0;i<a.length;i++)
    {
    	sum=sum+a[i];
    	
    }
     avg=sum/a.length;
	 System.out.println("Avg=" +avg);
    }

}
