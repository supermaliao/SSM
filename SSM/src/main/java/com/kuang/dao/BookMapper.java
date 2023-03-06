package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //增加一本书
    int addBook(Books bookes);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    int updateBookById(Books books);

    //查询一本书
    Books queryBookById(@Param("bookId") int id);

    //查询所有的书
    List<Books> queryAllBooks();

}
