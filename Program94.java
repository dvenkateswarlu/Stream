import java.util.*;

public class Program94 {

	public static void main(String[] args) {
		
		List<String> st = List.of("My","Name","is","Sonika");
		
		Optional<Integer> s = st.stream()
							.map(e -> e.length())
							.peek(e -> System.out.println(e))
							.reduce((s1,s2) -> s1+s2);
			System.out.println(s.get());
	}

}
