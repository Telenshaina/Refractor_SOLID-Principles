public class Order{
    // code code 
    private Double amount;
    private String  paymentmethod;

    public void setAmount (Double amount,String paymentmethod){
        this.amount= amount ;
        this.paymentmethod = paymentmethod;
    }
    public double getAmount(){
        return amount;
    }
    public String getPaymentMethod(){
        return paymentmethod;
    }

}