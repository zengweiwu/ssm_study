package com.zww.ssmbuild.dao;

import com.zww.ssmbuild.pojo.Books;

import java.util.List;

/**
 * 书本数据库操作接口
 */
public interface BooksMapper {
    /**
     * 增加一本书
     * @param book
     */
    public void  add(Books book);

    /**
     * 根据id删除一本书
     * @param bookID
     */
    public void deleteById(int bookID);

    /**
     *更新
     * @param book
     */
    public void update(Books book);

    /**
     * 根据id查询一本书
     * @param bookID
     * @return
     */
    public Books queryOneById(int bookID);

    /**
     * 查询所有书
     * @return
     */
    public List<Books> queryAll();
}
