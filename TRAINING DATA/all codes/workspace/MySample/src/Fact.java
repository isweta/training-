import java.util.Scanner; 
public class Fact {

	public static void main(String[] args) {
		System.out.println("Enter a number from 1 to 20");
		Scanner s=new Scanner(System.in);
		System.out.println("The factorial is: "+ fact(s.nextLong()));

	}
	
	public static long fact(long n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return n*fact(n-1);
	}

}
