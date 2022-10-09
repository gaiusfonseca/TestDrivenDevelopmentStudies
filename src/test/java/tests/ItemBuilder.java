package tests;

import java.util.Random;

public class ItemBuilder {

	private Item item;
	private final static String[] DESCRIPTIONS = {"Geladeira", "Fogão", "Microondas", "TV", "Maquina de Lavar"};
	private final static int QUANTITY = 1;
	
	public ItemBuilder() {
		
	}
	
	public Item generateRandonItem() {
		return new Item();
	}
	
	public double generateUnitValue(int index) {
		
		Random generator = new Random();
		double unitValue = 0;
		
		switch(index){
			case 0:
				//geladeiras terão preço entre 2000 e 3000 com variação de 50
				unitValue = (generator.nextInt(21) + 40)  * 50;
				break;
			case 1:
				//Fogões terão preço entre 1000 e 2000 com variação de 50
				unitValue = (generator.nextInt(21) + 20) * 50;
				break;
			case 2:
				//Microondas terão preço entre 250 e 600 com variação de 25
				unitValue = (generator.nextInt(15) + 10) * 25;
				break;
			case 3:
				//TVs terão preço entre 1500 e 5000 com variação de 100
				unitValue = (generator.nextInt(36) + 15) * 100;
				break;
			default:
				//Maquinas de lavar terão um valor entre 750 e 2500 com variacao de 75
				unitValue = (generator.nextInt(8) + 3) * 250;
		}
		
		return unitValue;
	}
}
