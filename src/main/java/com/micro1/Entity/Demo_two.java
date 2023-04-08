package com.micro1.Entity;

public class Demo_two {
    private int id_two;
    private String message_two;
    private int id;

    public Demo_two(int id_two, String message_two, int id) {
        this.id_two = id_two;
        this.message_two = message_two;
        this.id = id;
    }

    public int getId_two() {
        return id_two;
    }

    public void setId_two(int id_two) {
        this.id_two = id_two;
    }

    public String getMessage_two() {
        return message_two;
    }

    public void setMessage_two(String message_two) {
        this.message_two = message_two;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
