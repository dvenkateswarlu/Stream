package RealTimeProblems;

import java.util.List;

public class Problem6 {

	public static void main(String[] args) {
		
		List<String> s = List.of("java","python","c","sql");
		
			s.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);

	}

}
