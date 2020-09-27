package com.zww.ssmbuild.service.serviceImpl;

import com.zww.ssmbuild.dao.BooksMapper;
import com.zww.ssmbuild.pojo.Books;
import com.zww.ssmbuild.service.BooksService;

import java.util.List;

public class BooksServiceImpl implements BooksService {
    private BooksMapper booksMapper;

    //添加set方法 方便spring注入
    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    /**
     * 新增一本书
     *
     * @param book
     */
    public void add(Books book) {
        booksMapper.add(book);

    }

    /**
     * 根据id删除一本书
     * @param bookID
     */
    public void deleteById(int bookID) {
        booksMapper.deleteById(bookID);
    }

    /**
     * 修改一本书
     * @param book
     */
    public void update(Books book) {
        booksMapper.update(book);
    }

    /**
     * 根据id查询一本书
     * @param bookId
     * @return
     */
    public Books queryById(int bookId) {
        return booksMapper.queryOneById(bookId);
    }

    /**
     * 查询所有书
     * @return
     */
    public List<Books> queryAll() {
        return booksMapper.queryAll();
    }
}
