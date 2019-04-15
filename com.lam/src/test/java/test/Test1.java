package test;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;

import org.junit.Test;

import Calculator.Calculator;

public class Test1 {
	
	@Test
	public void test()  {
		
      Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter integer: ");
    	int a = input.nextInt();
    	int b = input.nextInt();
    	int d = input.nextInt();  	
		Calculator Addition =(op1,op2) -> (op1+op2);
	
		assertEquals(d,Addition.compute(a, b));
			
	}
}

