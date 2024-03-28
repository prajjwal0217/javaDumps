public class Instructor {
    public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;
	
	public Instructor(long id, String name, String title, String department, Book[] books) {
		this.id = id;
		this.name = name;
		this.title= title;
		this.department = department;
		this.books = books;
	}
	
	public Instructor(long id, String name, String title, String department) {
		this.id = id;
		this.name = name;
		this.title= title;
		this.department = department;
	}
	
	public Instructor(long id, String name, String title) {
		this.id = id;
		this.name = name;
		this.title= title;
		
	}
	
	public Instructor(long id, String name) {
		this.id = id;
		this.name = name;
	
	}
	
	public String getMostRecentBookTitle() {
        int  last = books.length -1;
        return books[last].getTitle();
		
	}
	
	public Book.BackupObject updateBook(int index, String title) {
        Book.BackupObject backup = books[index].createBackup();
            books[index].setTitle(title);
            return backup;
	}
	
	public Book updateBook(int index, Book book) {
		Book obj = books[index];
        books[index] = book;
        return obj;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");
		
		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
		System.out.println(instructor.getMostRecentBookTitle());
		System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());
				
		Book book4 = new Book("Introduction to Data Mining");
		System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
	}
}
