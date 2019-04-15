package test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import Calculator.Calculator;

public class Test3 {

	@Test
	public void test() {
		 Scanner input = new Scanner(System.in);
		System.out.print("Enter integer: ");
    	int a = input.nextInt();
    	int b = input.nextInt();
    	int f = input.nextInt();
    	
    	Calculator Multiplication =(op1,op2)->op1*op2;
		
		assertEquals(f,Multiplication.compute(a, b));
	
	}

}
