
import java.util.*;

class Employee
{
	String name;
	double sal;
	
	public Employee(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
	
}

public class Program3 {
	public static void main(String[] args) {
		
		List<Employee> l= new ArrayList<>();
		
		l.add(new Employee("Ram",25000));
		l.add(new Employee("Anji",55000));
		l.add(new Employee("Openheimer",85000));
		l.add(new Employee("Santhosh",50000));
		l.add(new Employee("Ramesh",75000));
		
		l.stream()
		.filter( e -> e.sal >50000)
		.map( s -> s.sal += (s.sal*0.1))
		.forEach(i -> System.out.println(i));
		
	}

}
