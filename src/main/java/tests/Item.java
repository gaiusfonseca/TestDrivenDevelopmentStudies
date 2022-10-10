package tests;

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
	
	public String getDescricao() {
		return description;
	}

	public void setDescricao(String description) {
		this.description = description;
	}

	public int getQuantidade() {
		return quantity;
	}

	public void setQuantidade(int quantity) {
		this.quantity = quantity;
	}

	public double getValorUnitario() {
		return unitValue;
	}

	public void setValorUnitario(double unitValue) {
		this.unitValue = unitValue;
	}
	
	public double getValorTotal() {
		return this.quantity * this.unitValue;	
	}
}
