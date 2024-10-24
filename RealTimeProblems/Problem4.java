package RealTimeProblems;

import java.util.List;

public class Problem4 {

	public static void main(String[] args) {
			List<String> l = List.of("a","abb","ab","abbbb","abbb");
			
				l.stream().sorted((s1,s2) -> s1.length()-s2.length()).forEach(System.out::println);
				l.stream().sorted(String::compareTo).forEach(System.out::println); //method Reference
	}

}
