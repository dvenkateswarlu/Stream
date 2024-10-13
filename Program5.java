import java.util.*;

public class Program5 {

	public static void main(String[] args) {
	
		List<String> l = List.of("Rani","raju","Sonika","Ajeo");
			
	long n =l.stream()
			.map(s -> s.toUpperCase())
			.count();
			
			 System.out.println(n);
			

	}

}
