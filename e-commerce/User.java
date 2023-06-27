import java.util.List;

public class User {
    private String username;
    private String password;
    private Cart cart;
    private Order order;
    public User(String username,String password){
        this.username=username;
        this.password=password;
        this.cart=new Cart();
        this.order=new Order();
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public Cart getCart(){
        return cart;
    }

    public Order getOrder() {
        return order;
    }

}
