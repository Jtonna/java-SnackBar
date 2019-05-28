package snackbarApp;

public class Snack
{
	// Snack had the fields (so knows);
	// int =  primitive data type, no decimal's
	// string = self explanitory
	// float = 4 bytes (54851.3285)
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private float cost;
	private int vendingId;

	// Snack has the methods (so can);
	public Snack(String name, int quantity, float cost, int vendingId)
	{
		//so can goes here
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingId = vendingId;
		
	}

}
