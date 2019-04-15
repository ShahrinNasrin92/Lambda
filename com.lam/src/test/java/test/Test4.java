package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import Calculator.Calculator;

public class Test4 {

	@Test
	public void test() {
		 Scanner input = new Scanner(System.in);
			System.out.print("Enter integer: ");
	    	int a = input.nextInt();
	    	int b = input.nextInt();
	    	int g = input.nextInt();
	    	
			try
			{
			Calculator Division =(op1,op2)->op1/op2;
		  
			
		  assertEquals(g,Division.compute(a, b));
			}
	       catch(Exception e)
	       {
	    	   assertThat(e.getMessage(), is("/ by zero"));
	       }		
	}

}
