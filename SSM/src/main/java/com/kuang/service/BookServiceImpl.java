package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    //servide调dao层：组合Dao
    //service内部增加其他的功能操作代码,内部代码事物交给Spring横切进入
    private BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
    }


    @Override
    public int addBook(Books bookes) {
        return bookMapper.addBook(bookes);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBookById(Books books) {
        return bookMapper.updateBookById(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }


}
