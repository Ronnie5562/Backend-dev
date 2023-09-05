// Encapsulation is a characteristic of OOP that sort of tells us that the data in a particular should be isolated from the outer world
// In java, we use the `private` keyword to restrict an instance variable from being accessed directly.

class Book
{
    private String Title;
    private String Author;
    private int ISBN;
    private int Price;
    private int no_of_pages;
    private String Category;


    // Getters and Setters
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        this.ISBN = iSBN;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public int getNo_of_pages() {
        return no_of_pages;
    }

    public void setNo_of_pages(int no_of_pages) {
        this.no_of_pages = no_of_pages;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }



    /**
     * @param Title
     * @param Author
     * @param ISBN
     * @param Price
     * @param no_of_pages
     * @param Category
     */
    // This is my constructor - A constructor in java is just like def __init__(self): in python.
    public Book(
        String Title,
        String Author,
        int ISBN,
        int Price,
        int no_of_pages,
        String Category){

        this.Title = Title;
        this. Author = Author;
        this.ISBN = ISBN;
        this.Price = Price;
        this.no_of_pages = no_of_pages;
        this.Category = Category;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Book book1 = new Book("Elon Musk and the Quest for a Fantastic Future ", "Ashlee Vance", 12345, 200, 450, "Inspirational");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("ISBN: " + book1.getISBN());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("No_of_pages: " + book1.getNo_of_pages());
        System.out.println("Category: " + book1.getCategory());


        System.out.println();

        book1.setTitle("Whose Image Are You? ");
        book1.setAuthor("LaFAMCALL");
        book1.setISBN(1234533);
        book1.setPrice(2000);
        book1.setNo_of_pages(300);
        book1.setCategory("Religious");

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("ISBN: " + book1.getISBN());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("No_of_pages: " + book1.getNo_of_pages());
        System.out.println("Category: " + book1.getCategory());
    }
}