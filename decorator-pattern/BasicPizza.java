public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "This is a basic pizza";
    }
    @Override
    public double getCost(){
        return 10.0;
    }
}
