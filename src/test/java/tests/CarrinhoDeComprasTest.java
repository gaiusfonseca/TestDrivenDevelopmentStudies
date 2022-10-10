package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarrinhoDeComprasTest {

	private ShoppingCart carrinho;
	
	@BeforeEach
	void setup() {
		carrinho = new ShoppingCart();
	}
	
	@Test
	void should_ReturnNull_When_CartIsEmpty() {
		//given
		double valorEsperado = 0;
		
		//when
		double valorEncontrado = carrinho.higherValue();
		
		//then
		assertEquals(valorEsperado, valorEncontrado);
		
	}
	
	@Test
	void should_ReturnItemValue_When_CartHasAnItem() {
		//given
		carrinho.adiciona(new Item("Geladeira", 1, 900));
		double valorEsperado = 900;
		
		//when
		double valorEncontrado = carrinho.higherValue();
		
		//then
		assertEquals(valorEsperado, valorEncontrado);
	}
	

	@Test
	void should_ReturnMaxValueItem_When_CartHasItens() {
		//given
		carrinho.adiciona(new Item("Geladeira", 1, 900));
		carrinho.adiciona(new Item("Fogao", 1, 1500));
		carrinho.adiciona(new Item("Maquina de Lavar", 1, 750));
		double valorEsperado = 1500;
		
		//when
		double valorEncontrado = carrinho.higherValue();
		
		//then
		assertEquals(valorEncontrado, valorEsperado);
	}
}
