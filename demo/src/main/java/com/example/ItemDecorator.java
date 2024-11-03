package jv.oop.lab_8.demo.src.main.java.com.example;

abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    public abstract String getDescription();
}
