package my.springcloud.test.provider.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloWordController {
    @RequestMapping("/say/{user}")
    public  Object sayHello(@PathVariable("user") String user){

        Map<String,String> obj =new HashMap<String, String>();

        obj.put("user",user);
        obj.put("say","say hello");

        return obj;

    }

}
