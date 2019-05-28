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
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingId = vendingId;

	}
	public int getId() {
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public float getCost(){
		return cost;
	}

	public void setCost(float cost){
		this.cost = cost;
	}

	public int getVendingId(){
		return vendingId;
	}

	public void setVendingId(int vendingId){
		this.vendingId = vendingId;
	}

	public int getQuantity(){
		return quantity;
	}

	public void addQuantity(){
		this.quantity =  this.quantity + quantity;
	}

	public int buyQuantity(int quantity){
		this.quantity = this.quantity - quantity;
		return this.quantity;
	}
}
