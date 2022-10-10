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
		int minQuantity = 1;
		int maxQuantity = 10;
		double minValue = 2000;
		double maxValue = 3000;
		
		Item tempItem;
		
		//when
		do {
			tempItem = ib.setRandomItem().build();
		}while(tempItem.getDescription() != "Geladeira");
		
		Item actualItem = tempItem;
		
		//then
		assertAll(
				() -> assertTrue(actualItem.getDescription() == expectedDescription),
				() -> assertTrue(minQuantity <= actualItem.getQuantity() && actualItem.getQuantity() <= maxQuantity),
				() -> assertTrue(minValue <= actualItem.getUnitValue() && actualItem.getUnitValue() <= maxValue)
				);
	}

}
