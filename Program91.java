
import java.util.*;
class Emp
{
	String name;
	int age;
	double sal;
	
	
	public Emp(String name, int age, double sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
}

public class Program91 {
	public static void main(String[] args) {
		
		List<Emp> l = new ArrayList<>();
			l.add(new Emp("Ram",24,3000));
			l.add(new Emp("Ankit",32,9000));
			l.add(new Emp("Sita",14,4000));
			l.add(new Emp("Vamsi",34,8000));
			l.add(new Emp("Oop",54,7000));
			l.add(new Emp("Xavier",64,30000));
			
			l.stream()
			.peek(e -> e.sal += (e.sal*0.1))
			.filter(e -> e.age >=30)
			.forEach(i -> System.out.println(i));
			
	}

}
