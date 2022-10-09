package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;
	
	@BeforeEach
	void setup() {
		carrinho = new CarrinhoDeCompras();
	}
	
	@Test
	void should_ReturnNull_When_CartIsEmpty() {
		//given
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		//when
		double valorEncontrado = carrinho.maiorValor();
		double valorEsperado = 0;
		
		//then
		assertEquals(valorEsperado, valorEncontrado);
		
	}
	
	@Test
	void should_ReturnItemValue_When_CartHasAnItem() {
		//given
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Item item = new Item("Geladeira", 1, 900);
		carrinho.adiciona(item);
		
		double valorEsperado = 900;
		
		//when
		double valorEncontrado = carrinho.maiorValor();
		
		//then
		assertEquals(valorEsperado, valorEncontrado);
	}
	

	@Test
	void should_ReturnMaxValueItem_When_CartHasItens() {
		//given
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900));
		carrinho.adiciona(new Item("Fogao", 1, 1500));
		carrinho.adiciona(new Item("Maquina de Lavar", 1, 750));
		double valorEsperado = 1500;
		
		//when
		double valorEncontrado = carrinho.maiorValor();
		
		//then
		assertEquals(valorEncontrado, valorEsperado);
	}
}
