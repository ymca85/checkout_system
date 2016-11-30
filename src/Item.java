
public class Item {

	private int priceOfItem;
	private int quantityOfItem;

	public Item(int priceOfItem, int quantityOfItem) {
		this.priceOfItem = priceOfItem;
		this.quantityOfItem = quantityOfItem;
	}
	
	public int getPriceOfItem() {
		return priceOfItem;
	}

	public void setPriceOfItem(int priceOfItem) {
		this.priceOfItem = priceOfItem;
	}

	public int getQuantityOfItem() {
		return quantityOfItem;
	}

	public void setQuantityOfItem(int quantityOfItem) {
		this.quantityOfItem = quantityOfItem;
	}

}
