
	import java.util.*;
	import java.util.stream.Collectors;

	public class Program96 {
	    public static void main(String[] args) {
	        List<String> names = List.of("Alice", "Bob", "Charlie");

	       List<String> upper = names.stream()
	    		   .collect(Collectors.mapping(n -> n.toUpperCase(), Collectors.toList()));
	       System.out.println(upper);
	    }
	}