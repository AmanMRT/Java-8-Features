package Method_Reference;


//Functional Interface
interface parser3
{
	void parse(int num);
}


public class PrimeOrNotPrime {

	PrimeOrNotPrime(int num)		//Constructor method
	{
		int count = 0;
		
		for(int i=2 ;i<= num; i++)
		{
			if((num % i) == 0)
			{
				count++;
			}
		}
		
		if(count == 1)
		{
			System.out.println("Is Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		parser3 p = PrimeOrNotPrime::new;
		p.parse(num);
	}

}
