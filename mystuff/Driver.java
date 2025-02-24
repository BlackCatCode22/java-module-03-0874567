package mystuff;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		 book1.title = "Atomic Habits";
		 book1.author = "James Clear";
		 book1.pages = 306;
		 book1.language = "English";


		 Book book2 = new Book();
		 book2.title = "Don't Believe Everything You Think(Expanded Edition)";
		 book2.author = "Joseph Nguyen";
		 book2.pages = 192;
		 book2.language = "English";
		 
		 System.out.println(book1.title);
		 System.out.println(book2.pages);

	}

}
