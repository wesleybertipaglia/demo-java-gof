package com.wesleybertipaglia.gof.behavior;

public class Strategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        cart.addItem(200);

        cart.pay(new CreditCardStrategy("1234567890123456", "12/24", "123"));

        cart.pay(new PayPalStrategy("test@mail.com", "testpass"));
    }
}

interface PaymentStrategy {
    void pay(int amount);
}

class ShoppingCart {
    private int totalAmount = 0;

    public void addItem(int price) {
        totalAmount += price;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(totalAmount);
    }
}

@SuppressWarnings("unused")
class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}

@SuppressWarnings("unused")
class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}
