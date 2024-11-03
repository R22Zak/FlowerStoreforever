package jv.oop.lab_8.demo.src.main.java.com.example;

public abstract class Item {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double price();
}
