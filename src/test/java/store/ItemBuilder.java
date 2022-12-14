package store;

import java.util.Random;

import store.Item;

public class ItemBuilder {

	private Item item;
	private static Random generator;
	private final static String[] DESCRIPTIONS = {"Geladeira", "Fogão", "Microondas", "TV", "Maquina de Lavar"};
	
	public ItemBuilder() {
		generator = new Random();
	}
	
	public ItemBuilder setDefaultItem() {
		item = new Item("Geladeira", 1, 1500);
		return this;
	}
	
	public ItemBuilder setCustomItem(String description, int quantity, double unitPrice) {
		item = new Item(description, quantity, unitPrice);
		return this;
	}
	
	public ItemBuilder setRandomItem() {
		int index = generator.nextInt(DESCRIPTIONS.length);
		item = new Item(rndDescription(index), rndQuantity(), rndUnitValue(index));
		return this;
	}
	
	public Item build() {
		return item;
	}
	
	private String rndDescription(int index) {
		return DESCRIPTIONS[index];
	}
	
	private int rndQuantity() {
		return generator.nextInt(10) + 1;	
	}
	
	private double rndUnitValue(int index) {
		double unitValue = 0;
		
		switch(index){
			case 0:
				//geladeiras terão preço entre 2000 e 3000 com variação de 50
				unitValue = generateValueInRange(2000, 3000, 50);
				break;
			case 1:
				//Fogões terão preço entre 1000 e 2000 com variação de 50
				unitValue = generateValueInRange(1000, 2000, 50);
				break;
			case 2:
				//Microondas terão preço entre 250 e 600 com variação de 25
				unitValue = generateValueInRange(250, 600, 25);
				break;
			case 3:
				//TVs terão preço entre 1500 e 5000 com variação de 100
				unitValue = generateValueInRange(1500, 5000, 100);
				break;
			default:
				//Maquinas de lavar terão um valor entre 750 e 2500 com variacao de 75
				unitValue = generateValueInRange(750, 2500, 75);
		}
		
		return unitValue;
	}
	
	private double generateValueInRange(int inferiorLimit, int superiorLimit, int multiplier) {
		int limitExclusive = (superiorLimit - inferiorLimit) / multiplier + 1;
		int baseValue = inferiorLimit / multiplier;
		return (generator.nextInt(limitExclusive) + baseValue) * multiplier;
	}
}
