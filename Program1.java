import java.util.*;
public class Program1
{
	public static void main(String[] args) {
		List<String> s = List.of("babu","Neon","babgi","bagi","roja");
		
		s.stream()
		.map(s1 -> s1.toUpperCase())
		.sorted((s1,s2) -> s2.compareTo(s1))
		.forEach(i -> System.out.println(i));
		System.out.println(s);
	}
}
