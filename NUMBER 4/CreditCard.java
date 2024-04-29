public class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("You are paying using Credit Card");
    }
}
