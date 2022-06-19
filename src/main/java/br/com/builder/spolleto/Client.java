package br.com.builder.spolleto;

import java.util.Arrays;

import br.com.builder.spolleto.model.Pasta;
import br.com.builder.spolleto.model.Size;
import br.com.builder.spolleto.model.builder.PastaBuilder;

public class Client {
	
	public static void main(String[] args) {
		
		//Primeiro exemplo de uso - pasta simples
		Pasta pastaSimples = PastaBuilder.builder()
		.withChesse(true)
		.withSize(Size.STANDARD)
		.withPepper(false)
		.withSauces(Arrays.asList("Salada Cheaser", "Salada de tomate"))
		.withToppings(Arrays.asList("Molho de queijo"))
		.build();
		
		System.out.println(pastaSimples);
		
		// Exemplo com apenas alguns atributos
		Pasta pastaPadrao = PastaBuilder.builder()
		.withChesse(false)
		.withSize(Size.STANDARD)
		.build();
		
		System.out.println(pastaPadrao);
		
	}

}
