package it.dstech.ortofrutta;

public class Prodotto {
	
	private String name;
	private int inventories;
	private double price;
	private String info;
	
	
	
	public Prodotto(String name, int inventories, double price, String info) {
		super();
		this.name = name;
		this.inventories = inventories;
		this.price = price;
		this.info = info;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInventories() {
		return inventories;
	}
	public void setInventories(int inventories) {
		this.inventories = inventories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return name + " [Inventories=" + inventories + ", Price=" + price + ", Info=" + info + "]";
	}
	
	
}
