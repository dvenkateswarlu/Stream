import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        List<String> s = List.of("babu", "Neon", "babgi", "bagi", "roja");

        s.stream()
         .filter(str -> str.charAt(0) == 'b')  
         .map(s1 -> s1.toUpperCase())
         .forEach(i -> System.out.println(i));
    }
}
