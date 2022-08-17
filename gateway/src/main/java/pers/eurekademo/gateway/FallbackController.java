package pers.eurekademo.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @RequestMapping("/fallback/service1")
    public String service1Fallback() {
        return "Service 1 fallback.";
    }

    @RequestMapping("/fallback/service2")
    public String service2Fallback() {
        return "Service 2 fallback.";
    }
}
