package jv.oop.lab_8.demo.src.main.java.com.example;

import java.util.List;

class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Delivering items by Post");
    }
}
