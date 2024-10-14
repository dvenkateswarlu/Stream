
import java.util.*;

class Person
{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Program7 {

	public static void main(String[] args) {
		
		List<Person> p = new ArrayList<>();
			
		p.add(new Person("Ramu",24));
		p.add(new Person("Abhi",15));
		p.add(new Person("Sandhi",43));
		p.add(new Person("Faquiri",29));
		p.add(new Person("Uman",19));
		p.add(new Person("Laxsh",64));
		
		Person s= p.stream()
				.filter(n -> n.age<30)
				.max( (s1,s2) -> s1.age - s2.age)
				.get();
		
		System.out.println(s.name);
		
	}

}
