import java.util.List;
import java.util.Optional;

public class Program93 {

	public static void main(String[] args) {
		
		List<String> st = List.of("My","Name","is","Sonika");
		
		Optional<String> s =st.stream()
						.reduce((s1,s2) -> s1+s2);
		
		System.out.println(s.get());
		

	}

}
