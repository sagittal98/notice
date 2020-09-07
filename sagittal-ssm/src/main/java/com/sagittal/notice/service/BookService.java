package com.sagittal.notice.service;

import com.sagittal.notice.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookService {
    List<Book> findAll();
}
