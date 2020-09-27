package com.zww.ssmbuild.service;

import com.zww.ssmbuild.pojo.Books;

import java.util.List;

public interface BooksService {
    /**
     * 增加一本书
     * @param book
     */
    public void add(Books book);

    /**
     * 根据id删除一本书
     * @param bookID
     */
    public void deleteById(int bookID);

    /**
     * 更新一本书
     * @param book
     */
    public void update(Books book);

    /**
     * 根据id查找一本书
     * @param bookId
     * @return
     */
    public  Books queryById(int bookId);

    /**
     * 查询所有的书
     * @return
     */
    public List<Books> queryAll();
}
