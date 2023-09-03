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
        ISBN = iSBN;
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
    Book book1 = new Book("Flying Cars", "Ashlee vance", 12345, 200, 450, "SciFi");
}