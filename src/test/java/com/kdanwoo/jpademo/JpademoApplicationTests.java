package com.kdanwoo.jpademo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
@Slf4j
class JpademoApplicationTests {

    @Autowired
    private DataSource dataSource;


    @Test
    void contextLoads(){
    }

}
