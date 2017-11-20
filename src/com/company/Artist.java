package com.company;

public class Artist {
    protected String name;


    public void paint(){
        System.out.println("Я не художник, я только учусь");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
