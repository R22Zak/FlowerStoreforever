package jv.oop.lab_8.demo.src.main.java.com.example;

class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", with ribbon";
    }
}
