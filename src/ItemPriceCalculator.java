
public class ItemPriceCalculator {


	public int calculateItemPrice(Item firstItem, Item secondItem) {
		return firstItem.getPriceOfItem() * firstItem.getQuantityOfItem() + secondItem.getPriceOfItem() * secondItem.getQuantityOfItem();
	}

}
