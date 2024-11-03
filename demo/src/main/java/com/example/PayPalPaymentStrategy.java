package jv.oop.lab_8.demo.src.main.java.com.example;

class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Paid " + price + " using PayPal");
    }
}