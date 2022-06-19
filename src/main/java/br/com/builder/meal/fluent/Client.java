package br.com.builder.meal.fluent;

import br.com.builder.meal.fluent.model.FastFoodMeal;
import br.com.builder.meal.fluent.model.builder.FastFoodMealBuilder;

public class Client {
	
	public static void main(String[] args) {
		FastFoodMeal burguerCombo = FastFoodMealBuilder.builder()
				.withDessert("Sorvete")
				.build();
		
		System.out.println(burguerCombo);
		
		FastFoodMeal superCombo = FastFoodMealBuilder.builder()
				.withDessert("Torta")
				.withDrink("Refrigerante")
				.withGift("Brinquedo")
				.withMain("Hamburguer")
				.withSide("Batata")
				.build();
		
		System.out.println(superCombo);
	}

}
