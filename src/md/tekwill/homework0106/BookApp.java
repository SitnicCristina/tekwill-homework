package md.tekwill.homework0106;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

abstract public class BookApp implements BookInterface {
    public static void main(String[] args) {
        Author author = new Author("Stephen King");
        Author author1 = new Author("Haruki Murakami");

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("IT", author));
        books.add(new Book("The Shining", author));
        books.add(new Book("Programing ", author));
        books.add(new Book("Dance Dance Dance", author1));

        filter(books, a -> !a.equals(author));
        books.removeIf(a -> !a.equals(author));
    }

    private static void filter(ArrayList<Book> books, Predicate<Book> validator) {
        for (Book book : books) {
            if (validator.test(book)){
                System.out.println(book);
            }
        }
    }
}
