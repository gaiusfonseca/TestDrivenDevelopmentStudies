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
		
		Item actualItem;
		
		//when
		do {
			actualItem = ib.generateRandonItem();
		}while(actualItem.getDescricao() != "Geladeira");
		
		String actualDescription = actualItem.getDescricao();
		int actualQuantity = actualItem.getQuantidade();
		
		final boolean isValueInRange;
		
		if(actualItem.getValorUnitario() >= minValue && actualItem.getValorUnitario() <= maxValue) {
			isValueInRange = true;
		}else {
			isValueInRange = false;
		}
		
		//then
		assertAll(
				() -> assertTrue(actualDescription == expectedDescription),
				() -> assertTrue(actualQuantity == expectedQuantity),
				() -> assertTrue(isValueInRange)
				);
	}

}
