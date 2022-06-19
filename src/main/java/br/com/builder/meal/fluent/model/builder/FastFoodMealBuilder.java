package br.com.builder.meal.fluent.model.builder;

import br.com.builder.meal.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {

	private FastFoodMeal fastFoodMeal;

	public FastFoodMealBuilder() {		
		fastFoodMeal = new FastFoodMeal();
	}
	
	public static FastFoodMealBuilder builder() {
		return new FastFoodMealBuilder();
	}
	
	public FastFoodMealBuilder withDrink(String drink) {
		this.fastFoodMeal.setDrink(drink);
		return this;
	}
	
	public FastFoodMealBuilder withMain(String main) {
		this.fastFoodMeal.setMain(main);
		return this;
	}
	
	public FastFoodMealBuilder withSide(String side) {
		this.fastFoodMeal.setSide(side);
		return this;
	}

	public FastFoodMealBuilder withDessert(String dessert) {
		this.fastFoodMeal.setDessert(dessert);
		return this;
	}
	
	public FastFoodMealBuilder withGift(String gift) {
		this.fastFoodMeal.setGift(gift);
		return this;
	}
	
	public FastFoodMeal build() {
		return this.fastFoodMeal;
	}
}
