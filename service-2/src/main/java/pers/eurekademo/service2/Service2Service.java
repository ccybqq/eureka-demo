package pers.eurekademo.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class Service2Service {
    @Autowired
    private IService2Repo service2Repo;

    ResponseEntity<Service2Module> save(Service2Module service2Module) {
        return ResponseEntity.ok(service2Repo.save(service2Module));
    }
}
