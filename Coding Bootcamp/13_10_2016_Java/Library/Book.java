import java.util.*;
public class Book {

    private String title;
    private Author author;
    private final String isbn;
    private int physical_copies;
    private int available_copies;
    private int times_rented;

    Book(String title,Author author,String isbn,int physical_copies,int available_copies,int times_rented) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.physical_copies = physical_copies;
        this.available_copies = available_copies;
        this.times_rented = times_rented;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setPhysical_copies(int physical_copies) {
        this.physical_copies = physical_copies;
    }
    public void setAvailable_copies(int available_copies) {
        this.available_copies = available_copies;
    }
    public void setTimes_rented(int times_rented) {
        this.times_rented = times_rented;
    }



    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public int getPhysical_copies() {
        return this.physical_copies;
    }
    public int getAvailable_copies() {
        return this.available_copies;
    }
    public int getTimes_rented() {
        return this.times_rented;
    }


    public String toString() {
        return ("Book Title: "+this.title+" Book Author: "+this.author+"Book isbn: "+this.isbn+"Book physical_copies: "+this.physical_copies+" Book available_copies: "+this.available_copies+" Book times rented: "+this.times_rented);
    }
    public void rentPhysicalCopy() {
        if (this.available_copies > 0) {
            System.out.println("Success!!!");
            this.available_copies--;
            this.times_rented++;
        }
    }
    public boolean isAvailable () {
        if (this.available_copies > 0) {
            return true;
        }
        else {
           return false;
        }
    }
    public boolean hasAuthor (String author) {
        if (author.equals(getAuthor())) {
            return true;
        }
        else {
            return false;
        }
    }
}
