package store;

public class Item {

	private String description;
	private int quantity;
	private double unitValue;
	
	public Item() {
		
	}
	
	public Item(String description, int quantity, double unitValue) {
		this.description = description;
		this.quantity = quantity;
		this.unitValue = unitValue;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}
	
	public double getTotalValue() {
		return this.quantity * this.unitValue;	
	}
}
