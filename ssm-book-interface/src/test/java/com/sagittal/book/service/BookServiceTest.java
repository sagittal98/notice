package com.sagittal.book.service;

import com.sagittal.dao.BookMapper;
import com.sagittal.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({"classpath*:spring/spring-dao.xml"})
public class BookServiceTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void findAll() {
        List<Book> books = bookMapper.selectByExample(null);
        System.out.println(Arrays.toString(books.toArray()));
    }
}