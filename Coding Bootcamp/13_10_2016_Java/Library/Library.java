import java.util.*;
public class Library {

    Book [] books = new Book[20];

    Library(Book [] books) {
        this.books = books;
    }

    public void printAvailableBooks () {
        int i;
        for (i = 0;i < 20;i++) {
            if (books[i].isAvailable()) {
                System.out.println(books[i].toString());
            }
        }
    }
    public void printBookDetails (String title) {
        int i;
        for (i = 0;i < 20;i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println(books[i].toString());
                break;
            }
            else  {
                System.out.println("Dear user unfortunatelly the requested book doesn't exists!");
            }
        }
    }
    public void printBookFromAuthor (String author) {
        int i;
        for (i = 0;i < 20;i++) {
            if (books[i].getAuthor().getName().equals(author)) {
                System.out.println(books[i].toString());
            }
        }
    }
}
