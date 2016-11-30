import java.util.List;

public class ItemPriceCalculator {

	public int calculateItemPriceForCheckout(List<Item> listOfItems) {

		int totalPriceAtCheckout = 0;
		for (Item item : listOfItems) {
			totalPriceAtCheckout += calculatePriceOfItem(item);
		}
		return totalPriceAtCheckout;
	}

	private int calculatePriceOfItem(Item item) {
		return item.getPriceOfItem() * item.getQuantityOfItem();
	}

}
