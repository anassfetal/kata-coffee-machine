package com.kata.coffee;

public enum TypeDrink {

	COFFEE("coffee", "C"), TEA("tea", "T"), CHOCOLAT("chocolat", "H");

	private String drink;
	private String drinkCode;

	TypeDrink(String drink, String drinkCode) {
		this.drink = drink;
		this.drinkCode = drinkCode;
	}

	public String getDrink() {
		return drink;
	}

	public String getDrinkCode() {
		return drinkCode;
	}

}
