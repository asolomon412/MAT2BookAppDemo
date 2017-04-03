import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<NewBook> bookList = new ArrayList<NewBook>();

		System.out.println("How many books would you like to enter?");
		// this is also a valid way to take in input and convert to the type you need
		// int numBooks = Integer.parseInt(scan.nextLine());
		int numBooks = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= numBooks; i++) {

			System.out.println("Enter ISBN: ");
			String ISBN = scan.nextLine();
			System.out.println("Enter Author: ");
			String author = scan.nextLine();
			System.out.println("Enter Title: ");
			String title = scan.nextLine();
			System.out.println("Enter Price: ");
			double price = scan.nextDouble();
			scan.nextLine();

			bookList.add(new NewBook(ISBN, author, title, price));

		}
		for (NewBook b : bookList)
			System.out.println(b.toString());
		scan.close();
	}

}
