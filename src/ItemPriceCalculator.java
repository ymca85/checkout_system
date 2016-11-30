import java.util.List;

public class ItemPriceCalculator {

	public int calculateItemPriceForCheckout(List<Item> listOfItems) {

		Item firstItem = listOfItems.get(0);
		Item secondItem = listOfItems.get(1);
		
		return calculatePriceOfItem(firstItem) + calculatePriceOfItem(secondItem);
	}

	private int calculatePriceOfItem(Item item) {
		return item.getPriceOfItem() * item.getQuantityOfItem();
	}

}
