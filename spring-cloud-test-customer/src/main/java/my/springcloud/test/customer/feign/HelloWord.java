package my.springcloud.test.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "PROVIDER",path = "/hello")
public interface HelloWord {
    @PostMapping("/say/{user}")
    public Object sayHello(@PathVariable("user")String user);
}
