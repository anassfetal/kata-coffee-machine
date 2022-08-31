package com.kata.coffee;

public class CoffeMachine {

	private static final String WITHOUT_VALUE = "without";

	public String getOrderMachine(String input) {
		String drinkCode = "";
		String sugarCounter = "";
		String withStick = "";

		String[] arrayString = input.split("\\s");

		String drinkType = arrayString[3];
		drinkCode = TypeDrink.valueOf(drinkType.toUpperCase()).getDrinkCode();

		int sugarTotalInt = 0;
		if (WITHOUT_VALUE.equals(arrayString[4])) {
			withStick = "";
			sugarCounter = "";
		} else {
			sugarTotalInt = Integer.parseInt(arrayString[5]);
			sugarCounter = Integer.toString(sugarTotalInt);
			withStick = "0";
		}

		return String.join(":", drinkCode, sugarCounter, withStick);
	}

}
