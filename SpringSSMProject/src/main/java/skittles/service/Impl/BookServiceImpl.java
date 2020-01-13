package skittles.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import skittles.dao.BookDao;
import skittles.domain.Book;
import skittles.service.BookService;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;
    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public void deleteBook(String bookName) {
        bookDao.deleteBook(bookName);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    public List<Book> findAllBook() {
        return bookDao.findAllBook();
    }

    @Override
    public List<Book> findBook(String bookName) {
        return bookDao.findBook(bookName);
    }

    @Override
    public Book findBookByName(String bookName) {
        return bookDao.findBookByName(bookName);
    }
}
