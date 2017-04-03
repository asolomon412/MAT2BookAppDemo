
public class UsedBook extends NewBook {

	private String wear;

	public UsedBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedBook(String iSBN, String author, String title, double price) {
		super(iSBN, author, title, price);
		// TODO Auto-generated constructor stub
	}
	
	public UsedBook(String iSBN, String author, String title, double price, String wear) {
		super(iSBN, author, title, price);
		this.wear = wear;
		
	}

	public String getWear() {
		return wear;
	}

	public void setWear(String wear) {
		this.wear = wear;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + wear;
	}

}
