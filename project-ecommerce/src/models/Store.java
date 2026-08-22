package models;

public class Store {

	private long id;
	private String name;
	private String description;
	private int quantityStock;
	private double price;
	private String category;
	private boolean active;

	private static int counter = 0;

	public Store() {

	}

	public Store(String name, String description, int quantityStock, double price, String category, boolean active) {
		this.id = ++counter;
		this.name = name;
		this.description = description;
		this.quantityStock = quantityStock;
		this.price = price;
		this.category = category;
		this.active = active;
	}

	public Store(long id, String name, String description, int quantityStock, double price, String category,
			boolean active) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantityStock = quantityStock;
		this.price = price;
		this.category = category;
		this.active = active;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
	    return "-------------------------\n" +
	           "ID: " + id + "\n" +
	           "Name: " + name + "\n" +
	           "Description: " + description + "\n" +
	           "Stock Quantity: " + quantityStock + "\n" +
	           "Price: US$" + price + "\n" +
	           "Category: " + category + "\n" +
	           "Active: " + active + "\n" +
	           "-------------------------";
	}
}
