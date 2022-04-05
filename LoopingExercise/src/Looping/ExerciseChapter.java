package Looping;

public class ExerciseChapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExerciseChapter ExCh=new ExerciseChapter();
		ExCh.Decimal2Binary(10);

	}
	public void Decimal2Binary(int decimalno)
	{
	 String remainderbinary="";
	 while(decimalno>0)
	 {
		 remainderbinary=(decimalno%2)+remainderbinary;
		 decimalno=decimalno/2;
	 }
	 System.out.print(remainderbinary);
	 
	}

}
