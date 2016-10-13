public class Librarian {

    Library lib;


    Librarian (Library lib) {
        this.lib = lib;
    }
    public void findMeBooksFromAuthor (String authorname) {
        this.lib.printBookFromAuthor(authorname);
    }
    public void findMeAvailableBooks () {
        this.lib.printAvailableBooks();
    }
    public void findMeBook (String title) {
        this.lib.printBookDetails(title);
    }
}
