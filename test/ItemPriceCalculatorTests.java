import static org.junit.Assert.*;

import org.junit.Test;

public class ItemPriceCalculatorTests {

	@Test
	public void test_calculate_price_of_one_item() {

		ItemPriceCalculator itemPriceCalculator = new ItemPriceCalculator();
		assertTrue(itemPriceCalculator.calculateItemPrice(100) == 100);
	}

}
