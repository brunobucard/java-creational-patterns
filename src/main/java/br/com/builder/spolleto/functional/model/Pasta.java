package br.com.builder.spolleto.functional.model;

import java.util.List;


public class Pasta {
	
	final private List<String> toppings;
	final private List<String> sauces;
	final private Size size;
	final private boolean cheese;
	final private boolean pepper;
	
	public Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
		super();
		this.toppings = toppings;
		this.sauces = sauces;
		this.size = size;
		this.cheese = cheese;
		this.pepper = pepper;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public List<String> getSauces() {
		return sauces;
	}

	public Size getSize() {
		return size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public boolean isPepper() {
		return pepper;
	}

	@Override
	public String toString() {
		return "Pasta [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
				+ ", pepper=" + pepper + "]";
	}
	
	public static class Builder {
		
		//mandatorio
		protected Size size;
		
		//opcional
		protected List<String> toppings;
		protected List<String> sauces;
		protected boolean cheese;
		protected boolean pepper;
		
		public Builder(Size size) {
			this.size = size;
		}
		
		public Builder withToppings(List<String> toppings) {
			this.toppings = toppings;
			return this;
		}
		
		public Builder withSauces(List<String> sauces) {
			this.sauces = sauces;
			return this;
		}
		
		public Builder withcheese(boolean cheese) {
			this.cheese = cheese;
			return this;
		}
		
		public Builder withPepper(boolean pepper) {
			this.pepper = pepper;
			return this;
		}
		
		public Pasta build() {
			return new Pasta(toppings, sauces, size, cheese, pepper);
		}
		
		
	}

}
