public class Driver {
    public static void main(String[] args) {
        Pizza pizza=new BasicPizza();
        pizza.getDescription();
        Pizza cheesePizza=new CheesePizza(pizza);
        System.out.println(cheesePizza.getDescription());
        System.out.println(cheesePizza.getCost());
    }
}
