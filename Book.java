import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price + "\n";
    }
}