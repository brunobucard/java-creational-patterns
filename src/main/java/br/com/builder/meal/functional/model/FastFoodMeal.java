package br.com.builder.meal.functional.model;

public class FastFoodMeal {

	private String drink;
	private String main;
	private String side;
	private String dessert;
	private String gift;

	private FastFoodMeal(Builder builder) {
		this.drink = builder.drink;
		this.main = builder.main;
		this.side = builder.side;
		this.dessert = builder.dessert;
		this.gift = builder.gift;
	}
	
	public String getDrink() {
		return drink;
	}
	public String getMain() {
		return main;
	}
	public String getSide() {
		return side;
	}
	public String getDessert() {
		return dessert;
	}
	public String getGift() {
		return gift;
	}
	
	
	@Override
	public String toString() {
		return "FastFoodMeal [drink=" + drink + ", main=" + main + ", side=" + side + ", dessert=" + dessert + ", gift="
				+ gift + "]";
	}
	public static Builder builder() {
		return new Builder();
	}


	public static final class Builder {
		private String drink;
		private String main;
		private String side;
		private String dessert;
		private String gift;

		private Builder() {
		}

		public Builder withDrink(String drink) {
			this.drink = drink;
			return this;
		}

		public Builder withMain(String main) {
			this.main = main;
			return this;
		}

		public Builder withSide(String side) {
			this.side = side;
			return this;
		}

		public Builder withDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public Builder withGift(String gift) {
			this.gift = gift;
			return this;
		}

		public FastFoodMeal build() {
			return new FastFoodMeal(this);
		}
	}
	
	
	
	
}
