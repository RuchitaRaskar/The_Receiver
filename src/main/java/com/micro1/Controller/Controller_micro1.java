package com.micro1.Controller;

import com.micro1.Entity.Entity_micro1;
import com.micro1.Service.micro1_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/micro1")
public class Controller_micro1 {
    @Autowired
    private micro1_service micro1;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Entity_micro1 getMessage(@PathVariable("id") int id)
    {
        Entity_micro1 entityMicro1 =  this.micro1.getMessage(id);
        List Message = this.restTemplate.getForObject("http://localhost:9010/micro2/micro1/"+ entityMicro1.getId(), List.class);
        entityMicro1.setDemo_two(Message);
        return entityMicro1;
    }

}
