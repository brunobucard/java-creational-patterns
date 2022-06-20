package br.com.builder.spolleto.functional;

import java.util.Arrays;

import br.com.builder.spolleto.functional.model.Pasta;
import br.com.builder.spolleto.functional.model.Size;

public class Client {
	
	public static void main(String[] args) {
		Pasta pastaSemQueijo = new Pasta.Builder(Size.STANDARD)
		.withcheese(false)
		.withPepper(true)
		.withSauces(Arrays.asList("Salada de tomate"))
		.withToppings(Arrays.asList("Molho de tomate", "Molho branco"))
		.build();
		
		System.out.println(pastaSemQueijo);
	}

}
