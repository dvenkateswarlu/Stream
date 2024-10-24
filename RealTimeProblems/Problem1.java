package RealTimeProblems;


interface Vehicle
{
	public default void startEngine()
	{
		System.out.println("Starts the Vehicle..");
	}
}
class Car implements Vehicle
{
	@Override
	public void startEngine()
	{
		System.out.println("Starts the Car Vehicle..");
	}

}

public class Problem1
{
	public static void main(String[] args) {
		
		 Vehicle v = new Car();
		 		v.startEngine(); // Car Override method will execute 
	}							// Starts the Car Vehicle..
}
