package com.sagittal.notice.controller;


import com.sagittal.notice.pojo.Book;
import com.sagittal.notice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {


    @Autowired
    private BookService bookService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Book> findAll(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        // 字符集utf-8
        request.setCharacterEncoding("UTF-8");
//        // 前端请求头设置，所有请求头都可以访问
        response.setHeader("Access-Control-Allow-Origin","*");
        System.out.println("here!");
        List<Book> all = bookService.findAll();
        System.out.println(Arrays.toString(all.toArray()));
        return all;
    }
}
