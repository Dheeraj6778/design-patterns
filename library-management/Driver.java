import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Library library=new Library();
        library.addBook("sample 1","tom");
        library.addBook("sample 2","tom");
        library.addBook("sample 3","harry");
        library.addBook("sample 4","wilson");
        List<Book> books=library.getBooks();
        library.display(books);
        library.removeBook("sample 2");
        library.display(library.getBooks());
        library.borrowBook("sample 2");
    }
}
