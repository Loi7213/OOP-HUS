package lab4.ex2.book2;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "Ahteck@nowhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@somewhere.com", 'm');

        Book javaDummy = new Book("Java for dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
