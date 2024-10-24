package RealTimeProblems;

import java.util.List;

public class Problem7 {

	public static void main(String[] args) {
		
		List<Integer> l = List.of(20,10,4,7,23,9);
		
		int res = l.stream().min((i1,i2)->i1-i2).get();
		System.out.println(res);
	}

}
