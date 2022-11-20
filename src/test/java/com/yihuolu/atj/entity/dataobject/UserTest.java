package com.yihuolu.atj.entity.dataobject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Test
    public void testAutoFIll() {
        User user = new User();
        user.setUserName("test");
        user.insert();
    }
}