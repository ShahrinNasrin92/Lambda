package test;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import Calculator.Calculator;

public class Test2 {

	@Test
	public void test() {
		  Scanner input = new Scanner(System.in);
		  
		    int a = input.nextInt();
	    	int b = input.nextInt();
		    int m = input.nextInt();
		   Calculator Substraction=(op1,op2)->op1-op2;
			
			assertEquals(m,Substraction.compute(a, b));
	}

}
