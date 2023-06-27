import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ecommerce {
    private List<Product> products;
    private Authentication auth;
    private boolean isAuthenticated;

    private User user;
    public Ecommerce(){
        this.products=new ArrayList<>();
        auth=new Authentication();
        Product product1=new Product("1","Shampoo",50);
        Product product2=new Product("2","cube",120);
        Product product3=new Product("3","Phone",100);
        Product product4=new Product("4","spoon",80);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        this.isAuthenticated=false;
    }
    public void setUser(){
        this.user=getAuth().getCurrentUser();
    }
    public Authentication getAuth(){
        return auth;
    }
    public void displayProducts(){
        for(Product product: products){
            System.out.println(product.toString());
        }
    }
    public Product getProductByName(String productName){
        for(Product product: products){
            if(product.getProductName().equalsIgnoreCase(productName)){
                return product;
            }
        }
        return null;
    }

    public void addToCart(String productName){
        Product product=getProductByName(productName);
        if(product!=null){
            String info=product.toString();
            System.out.println(info);
            user.getCart().addToCart(product);
        }
    }
    public void removeFromCart(String productName){
        Product product=getProductByName(productName);
        if(product!=null)
            user.getCart().removeFromCart(product);
    }
    public void checkOut(){
        Cart tempCart=user.getCart();
        Payment payment=new Payment(user);
        payment.makePayment();
        String receipt=payment.toString();
        System.out.println("receipt is \n");
        System.out.println(receipt);
        user.getOrder().addOrder(payment);
    }
    public void showAllOrders(){
        System.out.println("Your orders in the past are...");
        user.getOrder().displayAllOrders();
    }
}
