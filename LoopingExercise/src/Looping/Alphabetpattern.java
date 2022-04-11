package Looping;

public class Alphabetpattern {
	// Traingle pattern with smallcase alphabets
	//a
	//b a
	// c b a
	//d c b a
	//e d c b a

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char z='a';z<='e';z++)
		{
		for(char ch=z;ch>='a';ch--)
		{
		System.out.print(ch);
		}
		System.out.println();
		}

	}

}
