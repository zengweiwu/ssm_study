package com.zww.ssmbuild.controller;

import com.zww.ssmbuild.pojo.Books;
import com.zww.ssmbuild.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/interfaceOpen")
public class InterfaceOpen {
    //control调用service层
    @Autowired
    @Qualifier("booksServiceImpl")
    private BooksService booksService;

    /**
     * 显示全部书籍
     * @param model
     * @return
     */
    @RequestMapping("/tojingdong")
    public String tojingdong(@RequestParam(name = "openid") String openid, Model model){
        if (!openid.isEmpty()){
            return "redirect:https://www.jd.com/";
        }
        model.addAttribute("erro","请求错误");
        return "";
    }
}
