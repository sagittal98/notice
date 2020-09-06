package com.sagittal.notice.service.impl;

import com.sagittal.notice.dao.BookDao;
import com.sagittal.notice.pojo.Book;
import com.sagittal.notice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.queryAll(0, 5);
    }
}
