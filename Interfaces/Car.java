package Interfaces;

interface Vehicle
{
	default void message()
	{
		System.out.println("Inside Vehicle");
	}
}

interface FourWheeler
{
	default void message()
	{
		System.out.println("Inside FourWheeler");
	}
}

public class Car implements Vehicle, FourWheeler
{
	@Override
	public void message() {
		// TODO Auto-generated method stub
		Vehicle.super.message();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Car();
		v.message();
	}

	

}
