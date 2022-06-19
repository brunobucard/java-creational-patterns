package br.com.builder.meal.functional;

import br.com.builder.meal.functional.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		
		FastFoodMeal mealHamburguer = FastFoodMeal
				.builder()
				.withMain("Big mac")
				.build();
		
		System.out.println(mealHamburguer);
	}
}
