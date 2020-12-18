package com.zww.ssmbuild.controller;

import com.zww.ssmbuild.pojo.Books;
import com.zww.ssmbuild.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/books")
public class BooksController {
    //control调用service层
    @Autowired
    @Qualifier("booksServiceImpl")
    private BooksService booksService;

    /**
     * 显示全部书籍
     * @param model
     * @return
     */
    @RequestMapping("/queryAll")
    public String add(Model model){
        List<Books> books = booksService.queryAll();
        model.addAttribute("books",books);
        return "allBooks";
    }

    /**
     * 跳转到添加书籍页面
     * @return
     */
    @RequestMapping("/toaddBook")
    public String toaddBook(){
        return "addBook";
    }

    /**
     * 添加书籍
     * @param book
     * @return
     */
    @RequestMapping("/addBook")
    public String addBook(Books book){
        booksService.add(book);
        return "redirect:/books/queryAll";
    }

    /**
     * 跳转到更新页面
     * @return
     */
    @RequestMapping("/toUpdate")
    public String addBook(int bookId,Model model){
        Books book = booksService.queryById(bookId);
        model.addAttribute("Qbook",book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book){
        booksService.update(book);
        booksService.update(book);
        booksService.update(book);
        return "redirect:/books/queryAll";
    }


    @RequestMapping("/deleteBook")
    public String deleteBook(int bookId){
        booksService.deleteById(bookId);
        return "redirect:/books/queryAll";
    }
}
