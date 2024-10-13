
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		
	List<Integer> l = List.of(20,40,50,50,60,80,90);
	
		long n = l.stream().filter(i -> i>30).count();
		System.out.println(n);
	}

}
