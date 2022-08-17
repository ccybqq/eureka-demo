package pers.eurekademo.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
    @Autowired
    private Service2Service service2Service;

    @PostMapping("/service2/save")
    public ResponseEntity<Service2Module> save(@RequestBody Service2Module service2Module) {
        return service2Service.save(service2Module);
    }

    @GetMapping("service2/iam")
    public String iam() {
        return "I am Service 2.";
    }
}
