package Dao;

import java.awt.print.Book;
import java.util.List;

public interface BookDao {
    public Book getBookById(int id);

    public List<Book> getAllBooks();

    public int add(Book book);

    public int update(Book book);

    public int deleteById(int id);
}
