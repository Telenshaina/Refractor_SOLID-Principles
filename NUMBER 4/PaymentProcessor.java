public class PaymentProcessor {
    public void processPayment(Order order, PaymentMethod paymentMethod) {
        paymentMethod.processPayment(order.getAmount());

        //throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);

    }
}
