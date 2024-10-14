import java.util.List;

public class Program10 {

	public static void main(String[] args) {
		
		List<Integer> l1 = List.of(20,30,60,80,90);
		List<Integer> l2 = List.of(20,70,60,80,90);
		
			l1.stream()
			.filter(i1 -> l2.stream().anyMatch(i2 -> i1==i2))
			.forEach(i -> System.out.println(i));

	}

}
