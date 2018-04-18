package by.epam.tr.les09;

public class Main {

	public static void main(String[] args) {
		PrintedEdition printededition = new PrintedEdition("Book", 20000, "non periodical");
		PrintedEdition printededition1 = new PrintedEdition("Album", 1000, "non periodical");
		PrintedEdition printededition2 = new PrintedEdition("Calendar", 3000, "periodical");
		PrintedEdition printededition3 = new PrintedEdition("Magazine", 10000, "periodical");
		PrintedEdition printededition4 = new PrintedEdition("Newspaper", 50000, "periodical");
		PrintedEdition printededition5 = new PrintedEdition("Postcard", 3000, "non periodical");

		Book book = new Book("Book", 100000, "non periodical", "Chemistry");
		Book book1 = new Book("Book", 200000, "non periodical", "History");

		Album album = new Album("Album", 500, "non periodical", "Art");
		Album album1 = new Album("Album", 50, "non periodical", "WWII");

		Calendar calendar = new Calendar("Calendar", 100, "periodical", "table");
		Calendar calendar1 = new Calendar("Calendar", 1000, "periodical", "wall");

		Magazine magazine = new Magazine("Magazine", 1500, "periodical", "kids");
		Magazine magazine1 = new Magazine("Magazine", 3000, "periodical", "teenagers");

		Newspaper newspaper = new Newspaper("Newspaper", 4000, "periodical", "local");
		Newspaper newspaper1 = new Newspaper("Newspaper", 33000, "periodical", "republican");

		Postcard postcard = new Postcard("Postcard", 900, "periodical", "holidays greetings");
		Postcard postcard1 = new Postcard("Postcard", 400, "periodical", "nature");

		System.out.println("Books: " + book);
		System.out.println("Books: " + book1);

		System.out.println("Albums: " + album);
		System.out.println("Albums: " + album1);

		System.out.println("Calendars: " + calendar);
		System.out.println("Calendars: " + calendar1);

		System.out.println("Magazines: " + magazine);
		System.out.println("Magazines: " + magazine1);

		System.out.println("Newspapers: " + newspaper);
		System.out.println("Newspapers: " + newspaper1);

		System.out.println("Postcards: " + postcard);
		System.out.println("Postcards: " + postcard1);

	}
}
