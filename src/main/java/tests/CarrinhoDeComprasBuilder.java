package tests;

public class CarrinhoDeComprasBuilder {

	private ShoppingCart carrinho;
	
	public CarrinhoDeComprasBuilder() {
		carrinho = new ShoppingCart();
	}
	
	public CarrinhoDeComprasBuilder comItens(double... valores) {
		for(double valor : valores) {
			carrinho.adiciona(new Item("item", 1, valor));
		}
		
		return this;
	}
	
	public ShoppingCart cria() {
		return carrinho;
	}
}
