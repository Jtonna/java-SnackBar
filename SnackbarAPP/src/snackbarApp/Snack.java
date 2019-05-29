package snackbarApp;

public class Snack
{
	// Snack had the fields (so knows);
	// int =  primitive data type, no decimal's
	// string = self explanitory
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingId;

	// Snack has the methods (so can);
	public Snack(String name, int quantity, double cost, int vendingId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingId = vendingId;

	}

	public void setName(String name){
		this.name = name;
	}

	public int getQuantity(){
		return quantity;
	}

	public void addQuantity(int quantity){
		this.quantity -= quantity;
	}

	public void buySnack(int quantity){
		this.quantity -= quantity;
	}

	public double getTotalCost(int quantity){
		return quantity*cost;
	}
}
