public class Driver {
    public static void main(String[] args) {
        Ecommerce ecommerce=new Ecommerce();
        //login
        //Authentication auth=new Authentication();
        ecommerce.getAuth().signUp("sunny","1234");
        if(ecommerce.getAuth().login("sunny","1234")){
            ecommerce.setUser();
            ecommerce.displayProducts();
            User user=ecommerce.getAuth().getCurrentUser();
            ecommerce.addToCart("cube");
            ecommerce.addToCart("Phone");
            //user.getCart().displayCart();
            ecommerce.removeFromCart("Phone");
            ecommerce.addToCart("Shampoo");
            ecommerce.checkOut();
            ecommerce.showAllOrders();
            //new order
            ecommerce.addToCart("Phone");
            ecommerce.addToCart("spoon");
            ecommerce.checkOut();
            ecommerce.showAllOrders();
        }
        else{
            System.out.println("sign up/ invalid credentials");
        }
    }
}
