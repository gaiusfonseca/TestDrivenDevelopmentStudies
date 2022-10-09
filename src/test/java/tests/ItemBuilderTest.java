package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemBuilderTest {

	private ItemBuilder ib;
	
	@BeforeEach
	void setup() {
		ib = new ItemBuilder();
	}
	
	
	@Test
	void should_ReturnCorrectValues_When_ItemGeladeira() {
		//given
		String expectedDescription = "Geladeira";
		int expectedQuantity = 1;
		double minValue = 2000;
		double maxValue = 3000;
		
		Item tempItem;
		
		//when
		do {
			tempItem = ib.generateRandomItem();
		}while(tempItem.getDescricao() != "Geladeira");
		
		Item actualItem = tempItem;
		
		//then
		assertAll(
				() -> assertTrue(actualItem.getDescricao() == expectedDescription),
				() -> assertTrue(actualItem.getQuantidade() == expectedQuantity),
				() -> assertTrue(minValue <= actualItem.getValorUnitario() && actualItem.getValorUnitario() <= maxValue)
				);
	}

}
