package skittles.service;

import skittles.domain.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    void deleteBook(String bookName);
    void updateBook(Book book);
    List<Book> findAllBook();
    List<Book> findBook(String bookName);
    Book findBookByName(String bookName);
}
