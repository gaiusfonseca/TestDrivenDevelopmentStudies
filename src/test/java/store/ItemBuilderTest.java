package store;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import store.Item;

class ItemBuilderTest {

	private ItemBuilder ib;
	
	@BeforeEach
	void setup() {
		ib = new ItemBuilder();
	}
	
	@ParameterizedTest
	@CsvSource({
		"Geladeira, 1, 10, 2000, 3000",
		"Fogão, 1, 10, 1000, 2000",
		"Microondas, 1, 10, 250, 600",
		"TV, 1, 10, 1500, 5000",
		"'Maquina de Lavar', 1, 10, 750, 2500"
	})
	void should_ReturnCorrectValues_When_CorrectItem(String expectedDescription, int minQuantity, int maxQuantity, double minValue, double maxValue) {
		//given
		Item tempItem;
		
		//when
		do {
			tempItem = ib.setRandomItem().build();
		}while(!tempItem.getDescription().equals(expectedDescription));
		
		Item actualItem = tempItem;
		
		//then
		assertAll(
				() -> assertEquals(actualItem.getDescription(), expectedDescription),
				() -> assertTrue(minQuantity <= actualItem.getQuantity() && actualItem.getQuantity() <= maxQuantity),
				() -> assertTrue(minValue <= actualItem.getUnitValue() && actualItem.getUnitValue() <= maxValue)
				);
	}
}
