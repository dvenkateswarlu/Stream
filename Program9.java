
import java.util.*;

public class Program9 {

	public static void main(String[] args) {
		
		List<String> s = List.of("A","Sai","Ramana","Eswar");
		
	String str = s.stream()
				.max((s1,s2) -> s1.length() - s2.length())
				.get();
				
		System.out.println(str);

	}

}
