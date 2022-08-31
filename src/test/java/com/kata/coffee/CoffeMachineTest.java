package com.kata.coffee;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CoffeMachineTest {

	@Test
	public void testOneTeaOneSugar() {
		CoffeMachine coffeMachine = new CoffeMachine();
		String message= coffeMachine.getOrderMachine("I order 1 tea with 1 sugar");
		assertEquals("T:1:0",message);
	}
	
	@Test
	public void testOneCoffeTwoSugar() {
		CoffeMachine coffeMachine = new CoffeMachine();
		String message= coffeMachine.getOrderMachine("I order 2 coffee with 2 sugar");
		assertEquals("C:2:0",message);
	}
	
	@Test
	public void testOneChocolateWithoutSugar() {
		CoffeMachine coffeMachine = new CoffeMachine();
		String message= coffeMachine.getOrderMachine("I order 1 chocolat without sugar");
		assertEquals("H::",message);
	}
}
