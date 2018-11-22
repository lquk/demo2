package cn.yxbd;

import cn.yxbd.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo2Application.class)
public class MyTest {

    @Autowired
    private DemoService demoService;


    @Test
    public void Test1() {
        demoService.show();
    }

}
