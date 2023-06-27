import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    public Cart(){
        this.products=new ArrayList<>();
    }
    public void addToCart(Product product){
        this.products.add(product);
    }
    public void removeFromCart(Product product){
        if(products.contains(product))
            products.remove(product);
    }
    public int getTotalCost(){
        int costOfCart=0;
        for(Product product: products){
            costOfCart=costOfCart+product.getCost();
        }
        return costOfCart;
    }
    public void displayCart(){
        for(Product product: products){
            String info=product.toString();
            System.out.println(info);
        }
    }
    public void emptyCart(){
        this.products.clear();
    }
}
