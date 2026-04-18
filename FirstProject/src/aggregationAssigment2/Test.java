package aggregationAssigment2;

public class Test {
	public static void main(String[] args) {
		Author a1 = new Author("Joshua Bloch","joshua@email.com",'M');
		Book book1 = new Book("Effective Java",a1,45,15);
		book1.displayAuthorDetails();
	}

}
