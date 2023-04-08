package com.micro1.Service;

import com.micro1.Entity.Entity_micro1;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Service_impl1 implements micro1_service{

    List<Entity_micro1> list = List.of(
            new Entity_micro1(1)
    );
    @Override
    public Entity_micro1 getMessage(int id) {
        return list.stream().filter(entity -> entity.getId()==(id)).findAny().orElse(null);
    }
}
