package RealTimeProblems;

import java.util.function.BinaryOperator;

public class Problem3 {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> sum = (a,b) -> a+b;
		System.out.println(sum.apply(20, 30));
		
	}

}
