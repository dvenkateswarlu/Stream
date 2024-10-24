package RealTimeProblems;


import java.util.List;

public class Problem8 {

	public static void main(String[] args) {
		
		List<String> l = List.of("A","c","C","D","E");
		
			boolean res = l.stream().allMatch(s -> (s.charAt(0) >='A' && 'Z'>=s.charAt(0)));
			
			System.out.println(res);
			
		
	}

}
