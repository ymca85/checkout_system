
public class ItemPriceCalculator {

	public int calculateItemPriceForCheckout(Item firstItem, Item secondItem) {

		return calculatePriceOfItem(firstItem) + calculatePriceOfItem(secondItem);
	}

	private int calculatePriceOfItem(Item item) {
		return item.getPriceOfItem() * item.getQuantityOfItem();
	}

}
