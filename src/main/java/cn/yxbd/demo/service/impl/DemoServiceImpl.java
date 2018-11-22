package cn.yxbd.demo.service.impl;

import cn.yxbd.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public void show() {
        System.out.println("show方法");
    }
}
