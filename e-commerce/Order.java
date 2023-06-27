import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Payment> payments;

    public Order(){
        payments=new ArrayList<>();
    }
    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
    public void displayAllOrders(){
        for(Payment payment: payments){
            //System.out.println(payment.getTransactionId() +" amount paid: "+payment.getAmountPaid());
            System.out.println(payment.toString());
        }
    }
    public void addOrder(Payment payment){
        payments.add(payment);
    }
}
