package Calculator;

public class App {

	public static void main(String[] args) 
	{
		Calculator Addition =(a,b) -> 
		{
		int c=(a+b);
		return c;
		};
		Calculator Substraction=(a,b)->
		{
			int c=(a-b);
			return c;
			};
		Calculator Multiplication =(a,b)->
		{
			int c=(a*b);
			return c;
			};
			
			try
			{
			Calculator Division =(a,b)->
		   {
			int c= (a/b);			
					
				return c;
			
			};
			System.out.println("Division: " +Division.compute(8, 0));
			}
			
			catch(Exception e)
			{
				System.out.println("The value of b must be greater than 0");
			}
					
			
		System.out.println("Addition: " +Addition.compute(5, 5));
		System.out.println("Substraction: "+Substraction.compute(8, 3));
		System.out.println("Multiplication: "+Multiplication.compute(5, 4));
		
		
	

	}

}
