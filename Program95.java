
import java.util.function.*;

public class Program95 {

	public static void main(String[] args) {
		
		
			Predicate<Integer> s = Program95::IsEven;
								
		         System.out.println(s.test(12));
		         
	}
	
	public static boolean IsEven(int n)
	{
		return n%2==0;
	}

}
