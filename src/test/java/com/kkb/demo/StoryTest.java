package com.kkb.demo;

import com.kkb.hk.DemoApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Description
 * @Date 2021/9/25 9:27
 * @Created 30500
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class StoryTest {


    @Test
    public void test1() {

    }

}
