class ShoppingCart {
	private Item[] items;
	private int k;

	ShoppingCart(int c) {
		this.items = new Item[c];
		this.k = 0;
	}

	class Item {
		String itemName;
		int quantity;
		double price;

		Item(String n, int q, double p) {
			this.itemName = n;
			this.quantity = q;
			this.price = p;
		}
	}

	void add_item(String n, int q, double p) {
		if (k < items.length) {
			items[k++] = new Item(n, q, p);
		} else {
			System.out.println("Can't add more items");
		}
	}

	double total() {
		double t = 0;
		for (int i = 0; i < k; i++) {
			t += items[i].price * items[i].quantity;
		}
		return t;
	}

	void display() {
		for (int i = 0; i < k; i++) {
			System.out.println(items[i].itemName + " - " + items[i].quantity + "  $" + items[i].price);
		}
	}
}

public class L5_3 {
	public static void main(String[] args) {
		ShoppingCart s = new ShoppingCart(2);
		
		s.add_item("pen",2,10);
		s.add_item("Notebook",3,55);
		s.display();
		System.out.println("Total Price : $"+s.total());
	}

}