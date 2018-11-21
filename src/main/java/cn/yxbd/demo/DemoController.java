package cn.yxbd.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @RequestMapping("/")
    public Object index() {
        return new Date();
    }
}
