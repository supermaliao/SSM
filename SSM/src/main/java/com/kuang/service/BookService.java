package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books bookes);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBookById(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询所有的书
    List<Books> queryAllBooks();
}
