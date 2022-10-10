package tests;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ShoppingCart {

	private List<Item> itens;
	
	public ShoppingCart() {
		this.itens = new ArrayList();
	}
	
	public void addItem(Item novoItem) {
		this.itens.add(novoItem);
	}
	
	public List<Item> getItens(){
		return Collections.unmodifiableList(itens);
	}
	
	public double higherValue() {
		double higherValue = 0;
		int tamanho = itens.size();
		
		if(tamanho == 0) {
			return higherValue;
		}
		
		for(Item x : itens) {
			if(higherValue < x.getTotalValue()) {
				higherValue = x.getTotalValue();
			}
		}
		
		return higherValue;
	}
}
