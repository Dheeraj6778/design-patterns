public class CheesePizza extends PizzaDecorator{
    public CheesePizza(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription(){
        return pizza.getDescription()+", cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+2.0;
    }
}
