
import java.util.*;

public class Program8 {

	public static void main(String[] args) {
		
		List<Integer> l = List.of(20,40,50,50,60,80,90);
		
		Integer r = l.stream()
					.distinct()
					.sorted((s1,s2) -> s2-s1)
					.skip(1)
					.max((s1,s2) -> s1-s2)
					.get();
		
		System.out.print(r);
	}

}
