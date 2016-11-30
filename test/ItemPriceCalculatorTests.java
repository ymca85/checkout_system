import static org.junit.Assert.*;

import org.junit.Test;

public class ItemPriceCalculatorTests {

	@Test
	public void test_calculate_price_of_one_item() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		Item item = new Item(100, 1);
		assertTrue(itemPriceCalculator.calculateItemPrice(item.getPriceOfItem(), item.getQuantityOfItem(), 0, 0) == 100);
	}

	@Test
	public void test_calculate_price_of_two_items() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		Item item = new Item(100, 2);
		assertTrue(itemPriceCalculator.calculateItemPrice(item.getPriceOfItem(), item.getQuantityOfItem(), 0, 0) == 200);
	}

	@Test
	public void test_calculate_price_of_ten_items() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		Item item = new Item(100, 10);
		assertTrue(itemPriceCalculator.calculateItemPrice(item.getPriceOfItem(), item.getQuantityOfItem(), 0, 0) == 1000);
	}

	@Test
	public void test_calculate_price_of_two_different_items() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();

		Item item1 = new Item(100, 2);
		Item item2 = new Item(200, 1);

		assertTrue(itemPriceCalculator.calculateItemPrice(item1.getPriceOfItem(), item1.getQuantityOfItem(),
				item2.getPriceOfItem(), item2.getQuantityOfItem()) == 400);
	}

}
