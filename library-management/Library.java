import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library(){
        this.books=new ArrayList<>();
    }
    public void addBook(String title,String author){
        Book book=new Book(title,author,true);
        books.add(book);
        System.out.println("Book added to the library "+book.getTitle());
    }
    public void removeBook(String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                books.remove(book);
                return;
            }
        }
    }
    public Book findBookByTitle(String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }
    public void borrowBook(String title){
        Book book=findBookByTitle(title);
        if(book!=null && book.isAvailable()){
            book.setAvailable(false);
            System.out.println("book borrowed "+book.getTitle());
        }
        else{
            System.out.println("book not available");
        }
    }
    public void display(List<Book> list){
        for(Book book: list){
            System.out.println(book.getAuthor()+" "+book.getTitle());
        }
    }
    public List<Book> searchBooksByAuthor(String author){
        List<Book> result=new ArrayList<>();
        for(Book book: books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchBooksByTitle(String title){
        List<Book> result=new ArrayList<>();
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                result.add(book);
            }
        }
        return  result;
    }
    public List<Book> getBooks(){
        return books;
    }

}
