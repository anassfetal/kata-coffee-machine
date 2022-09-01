package com.kata.coffee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoffeMachine {

	private static final String WITHOUT_VALUE = "without";

	public String getOrderMachine(String input) {
		String drinkCode = "";
		String sugarCounter = "";
		String withStick = "";

		String regex = "I order (\\d) (\\w+) (.+) sugar";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(input);
		if (matcher.find()) {
			drinkCode = TypeDrink.valueOf(matcher.group(2).toUpperCase()).getDrinkCode();
			String sugarCharacter=matcher.group(3);
			if (!WITHOUT_VALUE.equals(sugarCharacter)) {
				sugarCounter = sugarCharacter.substring(sugarCharacter.length() - 1);
				withStick = "0";
			}
		}

		return String.join(":", drinkCode, sugarCounter, withStick);
	}

}
