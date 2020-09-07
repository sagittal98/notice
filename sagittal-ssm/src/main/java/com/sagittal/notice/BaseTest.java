package com.sagittal.notice;


import com.sagittal.notice.dao.BookDao;
import com.sagittal.notice.pojo.Book;
import com.sagittal.notice.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class BaseTest {


    @Autowired
    private BookDao bookDao;
    @Autowired
    private BookService bookService;

    @Test
    public void testQueryById(){
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void findAll(){
        List<Book> books = bookService.findAll();
        System.out.println(Arrays.toString(books.toArray()));
    }

}
