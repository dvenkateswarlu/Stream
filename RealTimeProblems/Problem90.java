package RealTimeProblems;

import java.util.List;
import java.util.Optional;

public class Problem90 {

	public static void main(String[] args) {
		
		List<String> l = List.of("A","c","C","D","E");
			
		Optional<String> str = l.stream().reduce((s1,s2)->s1+s2);
		System.out.println(str.get());
		
	}

}
