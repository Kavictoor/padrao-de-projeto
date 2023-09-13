package estoque;

public class Product {
	
	public String nameProduct;
	public double price;
	
	public Product(String name, double price) {
	
		this.nameProduct = name;
		this.price = price;
	}

	public String getName() {
		return nameProduct;
	}

	public void setName(String name) {
		this.nameProduct = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
