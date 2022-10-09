package tests;

public class MaiorPreco {

	public MaiorPreco() {
		
	}
	
	public double encontra(CarrinhoDeCompras carrinho) {
		
		double maiorValor = 0;
		int tamanho = carrinho.getItens().size();
		
		if(tamanho == 0) {
			return maiorValor;
		}
		
		for(Item x : carrinho.getItens()) {
			if(maiorValor < x.getValorTotal()) {
				maiorValor = x.getValorTotal();
			}
		}
		
		return maiorValor;
	}
	
}
