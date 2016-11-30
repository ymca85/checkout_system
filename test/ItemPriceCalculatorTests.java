import static org.junit.Assert.*;

import org.junit.Test;

public class ItemPriceCalculatorTests {

	@Test
	public void test_calculate_price_of_one_item() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		assertTrue(itemPriceCalculator.calculateItemPrice(100, 1, 0, 0) == 100);
	}
	
	@Test
	public void test_calculate_price_of_two_items() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		assertTrue(itemPriceCalculator.calculateItemPrice(100, 2, 0, 0) == 200);
	}
	
	@Test
	public void test_calculate_price_of_ten_items() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		assertTrue(itemPriceCalculator.calculateItemPrice(100, 10, 0, 0) == 1000);
	}
	
	@Test
	public void test_calculate_price_of_two_different_items() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		assertTrue(itemPriceCalculator.calculateItemPrice(100, 2, 200, 1) == 400);
	}
	
}
