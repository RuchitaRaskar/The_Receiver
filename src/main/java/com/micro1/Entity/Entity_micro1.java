package com.micro1.Entity;

import java.util.ArrayList;
import java.util.List;

public class Entity_micro1 {
    public int id;
    List<Demo_two> demo_two = new ArrayList<>();

    public Entity_micro1(int id, List<Demo_two> demo_two) {
        this.id = id;
        this.demo_two = demo_two;
    }
    public Entity_micro1(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Demo_two> getDemo_two() {
        return demo_two;
    }

    public void setDemo_two(List<Demo_two> demo_two) {
        this.demo_two = demo_two;
    }
}
