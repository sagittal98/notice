package com.sagittal.book.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sagittal.book.service.BookService;
import com.sagittal.dao.BookMapper;
import com.sagittal.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findAll() {
        return bookMapper.selectByExample(null);
    }
}
