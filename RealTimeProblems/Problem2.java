package RealTimeProblems;

interface Calculator
{
	int add(int a,int b);
	public static Calculator get()
	{
		return (a,b)->a+b;
	}
}
public class Problem2 {
	
	public static void main(String[] args) {
		
		Calculator c = Calculator.get();
			int res = c.add(10, 20);
			System.out.println(res);
		
	}

}
