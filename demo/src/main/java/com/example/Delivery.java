package jv.oop.lab_8.demo.src.main.java.com.example;

import java.util.List;

interface Delivery {
    void deliver(List<Item> items);
}

// Клас PostDeliveryStrategy
class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Delivering items by Post");
    }
}