package com.sagittal.book.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.sagittal.book.service.BookService;
import com.sagittal.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Reference
    private BookService bookService;

    @RequestMapping("/findAll")
    @ResponseBody
    private List<Book> findAll(){
        return bookService.findAll();
    }
}
