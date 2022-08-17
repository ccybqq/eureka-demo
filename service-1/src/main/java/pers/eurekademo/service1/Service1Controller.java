package pers.eurekademo.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
    @Autowired
    private Service1Service service1Service;

    @PostMapping("/service1/save")
    public ResponseEntity<Service1Module> save(@RequestBody Service1Module service1Module) {
        return service1Service.save(service1Module);
    }
}
