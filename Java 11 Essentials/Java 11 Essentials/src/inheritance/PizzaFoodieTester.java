package inheritance;

public class PizzaFoodieTester {

	public static void main(String[] args) {
		Pizza[] pizzaList1 = {new Pizza("Regular", 1), new Pizza("Medium", 2)};

		Foodie foodie = new Foodie(1, "Jacob", "NY", 3211425632l);
		foodie.calculateTotalPrice(pizzaList1);
		System.out.println("Total cost for Foodie "+foodie.getFoodieName()+": "+foodie.getTotalPrice());

		SuperFoodie superFoodie = new SuperFoodie(2, "Queenie", "Delhi", 6523413123l, 5);
		superFoodie.calculateTotalPriceWithDiscount(pizzaList1);
		System.out.println("Total cost for SuperFoodie "+superFoodie.getFoodieName()+": "+superFoodie.getTotalPrice());

		UltraFoodie ultraFoodie = new UltraFoodie(3, "Eddie", "London", 7432256735l, 9);
		ultraFoodie.calculateTotalPriceWithRewardPoints(pizzaList1);
		System.out.println("Total cost for UltraFoodie "+ultraFoodie.getFoodieName()+": "+ultraFoodie.getTotalPrice()+" with Reward Points: "+ultraFoodie.getRewardPoints());
	}

}

