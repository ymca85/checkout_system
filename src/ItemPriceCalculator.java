
public class ItemPriceCalculator {

	public int calculateItemPrice(int priceOfFirstItem, int quantityOfFirstItem, int priceOfSecondItem, int quantityOfSecondItem) {
		return priceOfFirstItem * quantityOfFirstItem + priceOfSecondItem * quantityOfSecondItem;
	}

}
