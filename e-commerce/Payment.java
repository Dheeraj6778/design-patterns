import java.util.Random;

public class Payment {
    private String transactionId;
    private Cart cart;
    private int amountPaid;
    private User user;
    public Payment(User user){
        this.cart=user.getCart();
        this.user=user;
    }
    public void makePayment(){
        int toPay=this.cart.getTotalCost();
        //3rd party api will handle the payment
        //generate transaction id
        StringBuilder id=new StringBuilder(10);
        for(int i=0;i<10;i++){
            int ch=(int)(Math.random()*26);
            id.append('a'+ch);
        }
        this.transactionId=id.toString();
        System.out.println("payment done! "+toPay);
        this.amountPaid=toPay;
        user.getCart().emptyCart();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public int getAmountPaid() {
        return amountPaid;
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("the transaction id is "+getTransactionId()+"\n");
        sb.append("the amount paid is "+Integer.toString(getAmountPaid())+"\n");
        return sb.toString();
    }
}
