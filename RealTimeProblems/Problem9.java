package RealTimeProblems;

import java.util.*;

class Emp
{
	double sal;
	
	public Emp(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [sal=" + sal + "]";
	}
	
}
public class Problem9 {
	public static void main(String[] args) {
		
		List<Emp> e = new ArrayList<>();
				e.add(new Emp(20000));
				e.add(new Emp(400000));
				e.add(new Emp(600000));
				e.add(new Emp(80000));
				e.add(new Emp(100000));
				
			boolean b = e.stream().anyMatch(p -> p.sal >100000);
			System.out.println(b);
				
				
	}
}
