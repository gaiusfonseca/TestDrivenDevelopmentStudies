package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	private ShoppingCart shoppingCart;
	
	@BeforeEach
	void setup() {
		shoppingCart = new ShoppingCart();
	}
	
	@Test
	void should_ReturnNull_When_CartIsEmpty() {
		//given
		double expected = 0;
		
		//when
		double actual = shoppingCart.higherValue();
		
		//then
		assertEquals(expected, actual);
		
	}
	
	@Test
	void should_ReturnItemValue_When_CartHasAnItem() {
		//given
		shoppingCart.addItem(new Item("Geladeira", 1, 900));
		double expected = 900;
		
		//when
		double actual = shoppingCart.higherValue();
		
		//then
		assertEquals(expected, actual);
	}
	

	@Test
	void should_ReturnMaxValueItem_When_CartHasItens() {
		//given
		shoppingCart.addItem(new Item("Geladeira", 1, 900));
		shoppingCart.addItem(new Item("Fogao", 1, 1500));
		shoppingCart.addItem(new Item("Maquina de Lavar", 1, 750));
		double expected = 1500;
		
		//when
		double actual = shoppingCart.higherValue();
		
		//then
		assertEquals(expected, actual);
	}
}
