import java.util.List;
import java.util.Optional;

public class Program92 {

	public static void main(String[] args) {
		
		List<Integer> l = List.of(10,20,30,40,50);
		
		Optional<Integer> r = l.stream()
		.reduce((i1,i2) -> i1+i2);

		System.out.println(r.get());
		
		 int r1 = l.stream()
					.reduce(0, (i1,i2) -> i1+i2);
	
		System.out.println(r1);

	}

}
