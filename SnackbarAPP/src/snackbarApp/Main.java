package snackbarApp;

public class Main
{
	private static void CustomerInteractions(){
	Customer c1 = new Customer("Jane", 56.50);
	Customer c2 = new Customer("Mario", 23.25);

	VendingMachine v1 = new VendingMachine("Food");
	VendingMachine v2 = new VendingMachine("Drink");
	VendingMachine v3 = new VendingMachine("Office");

	Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
	Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
	Snack s3 = new Snack("Pretzal", 30, 2.00, v1.getId());
	Snack s4 = new Snack("Soda", 24, 2.5, v2.getId());
	Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

	c1.purchase(s4.getTotalCost(4));
	s4.buySnack(4);
	System.out.println("test");
	System.out.println("Customer 1 buys 3 of snack 4. " + c1.getName() + " has $" + c1.getCashOnHand() + " remaining. There are also " + s3.getQuantity() + " of " + s3.getName() + " left. " + "\n");
	}

	public static void main(String[] args){
		CustomerInteractions();
	}
}
