package tests;

public class CarrinhoDeComprasBuilder {

	private CarrinhoDeCompras carrinho;
	
	public CarrinhoDeComprasBuilder() {
		carrinho = new CarrinhoDeCompras();
	}
	
	public CarrinhoDeComprasBuilder comItens(double... valores) {
		for(double valor : valores) {
			carrinho.adiciona(new Item("item", 1, valor));
		}
		
		return this;
	}
	
	public CarrinhoDeCompras cria() {
		return carrinho;
	}
}
