package tests;

public class ShoppingCartBuilder {

	private ShoppingCart shoppingCart;
	
	public ShoppingCartBuilder() {
		shoppingCart = new ShoppingCart();
	}
	
	public ShoppingCartBuilder comItens(double... valores) {
		for(double valor : valores) {
			shoppingCart.addItem(new Item("item", 1, valor));
		}
		
		return this;
	}
	
	public ShoppingCart build() {
		return shoppingCart;
	}
}
