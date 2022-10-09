package tests;

public class MaiorPreco {

	public MaiorPreco() {
		
	}
	
	public double encontra(CarrinhoDeCompras carrinho) {
		
		double maiorValor = 0;
		int tamanho = carrinho.getItens().size();
		
		switch(tamanho) {
		case 0:
			maiorValor = 0;
			break;
		case 1:
			maiorValor = carrinho.getItens().get(0).getValorTotal();
			break;
		default:
			for(Item x : carrinho.getItens()) {
				if(maiorValor < x.getValorTotal()) {
					maiorValor = x.getValorTotal();
				}
			}
		}
		
		return maiorValor;
	}
	
}
