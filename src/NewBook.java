public class NewBook {

	private String ISBN;
	private String author;
	private String title;
	private double price;

	// empty constructor
	public NewBook() {

	}

	// constructor using fields
	public NewBook(String iSBN, String author, String title, double price) {
		ISBN = iSBN;
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return ISBN + "\t" + author + "\t" + title + "\t$" + price; 
	}

}
