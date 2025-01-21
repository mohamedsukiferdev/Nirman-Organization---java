package day13;

public class book {
	private int id;
	private String author;
	private double price;
	
	
	book(){}
	
	public book(int id, String author, double price) {
		this.id = id;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", author=" + author + ", price=" + price + "]";
	}

	
}
