import java.util.List;

public class Program6 {

	public static void main(String[] args) {
	
		List<String> l = List.of("Rani","raju","Sonika","Ajeo","Rani");
			
			l.stream()
			.distinct()
			.map(s -> s.toLowerCase())
			.sorted( (s1,s2) -> s2.compareTo(s2))
			.forEach(i -> System.out.println(i));
	}

}