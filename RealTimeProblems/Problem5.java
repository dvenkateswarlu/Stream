package RealTimeProblems;

import java.util.List;

public class Problem5 {

	public static void main(String[] args) {
		
			List<Integer> l = List.of(2,4,6,5,7,9);
			
			l.stream()
			 .filter(i->i%2==0)
			 .forEach(System.out::println);
			
	}

}
