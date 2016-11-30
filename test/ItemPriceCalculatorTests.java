import static org.junit.Assert.*;

import org.junit.Test;

public class ItemPriceCalculatorTests {

	@Test
	public void test_calculate_price_of_one_item() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		Item item = new Item(100, 1);
		Item dummyItemZeroPriceZeroQuantity = new Item(0, 0);
		assertEquals(itemPriceCalculator.calculateItemPrice(item, dummyItemZeroPriceZeroQuantity), 100);
	}

	@Test
	public void test_calculate_price_of_two_items() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		Item item = new Item(100, 2);
		Item dummyItemZeroPriceZeroQuantity = new Item(0, 0);
		assertEquals(itemPriceCalculator.calculateItemPrice(item, dummyItemZeroPriceZeroQuantity), 200);
	}

	@Test
	public void test_calculate_price_of_ten_items() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		Item item = new Item(100, 10);
		Item dummyItemZeroPriceZeroQuantity = new Item(0, 0);
		assertEquals(itemPriceCalculator.calculateItemPrice(item, dummyItemZeroPriceZeroQuantity), 1000);
	}

	@Test
	public void test_calculate_price_of_two_different_items() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();

		Item firstItem = new Item(100, 2);
		Item secondItem = new Item(200, 1);

		assertEquals(itemPriceCalculator.calculateItemPrice(firstItem, secondItem), 400);
	}

}
