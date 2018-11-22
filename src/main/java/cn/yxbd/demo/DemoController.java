package cn.yxbd.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Properties;
import java.util.Set;

@Controller
@ConfigurationProperties(prefix = "prople")
public class DemoController {

    private String name;
    private String sex;
    private Integer age;

    @RequestMapping("/")
    @ResponseBody
    public Object index() {
        return new Date() + "   " + name + "    " + sex + "   " + age;
    }

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Set<Object> objects = properties.keySet();
        for (Object obj : objects) {
            Object o = properties.get(obj);
            System.out.println(obj.toString() + "\r\n\t" + o.toString());
        }
        System.out.println("master");
        String s1 = new String();
        String s = new String();


        System.out.println("dev分支");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}