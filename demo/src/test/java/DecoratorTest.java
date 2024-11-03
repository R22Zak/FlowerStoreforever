package jv.oop.lab_8.demo.src.test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jv.oop.lab_8.demo.src.main.java.com.example.Item;
import jv.oop.lab_8.demo.src.main.java.com.example.PaperDecorator;
import jv.oop.lab_8.demo.src.main.java.com.example.RomashkaFlower;

public class DecoratorTest {

    @Test
    public void testPaperDecorator() {
        Item flower = new RomashkaFlower();
        Item decoratedFlower = new PaperDecorator(flower);
        
        Assertions.assertEquals("Romashka Flower, wrapped in paper", decoratedFlower.getDescription());
        Assertions.assertEquals(33.0, decoratedFlower.price(), 0.01);
    }
}
