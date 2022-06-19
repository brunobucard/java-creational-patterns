package br.com.builder.spolleto.fluent.model.builder;

import java.util.List;

import br.com.builder.spolleto.fluent.model.Pasta;
import br.com.builder.spolleto.fluent.model.Size;

public class PastaBuilder {

	private Pasta pasta;

	public PastaBuilder() {
		pasta = new Pasta();
	}

	public static PastaBuilder builder() {
		return new PastaBuilder();
	}

	public PastaBuilder withToppings(List<String> toppings) {
		this.pasta.setToppings(toppings);
		return this;
	}

	public PastaBuilder withSauces(List<String> sauces) {
		this.pasta.setSauces(sauces);
		return this;
	}

	public PastaBuilder withSize(Size size) {
		this.pasta.setSize(size);
		return this;
	}

	public PastaBuilder withChesse(boolean cheese) {
		this.pasta.setCheese(cheese);
		return this;
	}

	public PastaBuilder withPepper(boolean pepper) {
		this.pasta.setPepper(pepper);
		return this;
	}

	public Pasta build() {
		return this.pasta;
	}
}
