package snackbarApp;

public class Main
{
	public static void main(String[] args)
	{
	Customer jane = new Customer("Jane", 56.50);
	Customer mario = new Customer("Mario", 23.25);

	VendingMachine food = new VendingMachine("Food");
	VendingMachine drink = new VendingMachine("Drink");

	Snack chips = new Snack("Chips", 36, 1.75, food.getId());
	Snack chocolatBar = new Snack("Chocolate Bar", 36, 1, food.getId());
	Snack pretzal = new Snack("Pretzal", 30, 2.00, food.getId());
	Snack soda = new Snack("Soda", 24, 2.5, drink.getId());
	Snack water = new Snack("Water", 20, 2.75, drink.getId());

	jane.buy(soda.getTotalCost(4));

	}
}
