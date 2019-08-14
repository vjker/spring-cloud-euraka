package my.springcloud.test.customer.controller;

import my.springcloud.test.customer.feign.HelloWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName TestController
 * @Description 测试接口
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private HelloWord helloWord;
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/sayHi")
    public Object sayHi(){
       return helloWord.sayHello("--------张三-------");
    }
    @PostMapping("/restHi")
    public Object restHi(){
        return  restTemplate.postForEntity(
                "http://Provider/hello//say/lisi",null,Object.class);
    }
}
