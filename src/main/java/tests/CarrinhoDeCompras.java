package tests;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CarrinhoDeCompras {

	private List<Item> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList();
	}
	
	public void adiciona(Item novoItem) {
		this.itens.add(novoItem);
	}
	
	public List<Item> getItens(){
		return Collections.unmodifiableList(itens);
	}
}
