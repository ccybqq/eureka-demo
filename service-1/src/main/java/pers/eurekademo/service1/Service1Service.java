package pers.eurekademo.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Service1Service {
    @Autowired
    private IService1Repo service1Repo;

    ResponseEntity<Service1Module> save(Service1Module service1Module) {
        return ResponseEntity.ok(service1Repo.save(service1Module));
    }
}
