package jv.oop.lab_8.demo.src.main.java.com.example;

public abstract class AbstractDecorator extends Item {
    protected Item item;

    public AbstractDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return item.price();
    }
}