public class Example {
    public static void main(String[] args) {
        Company company=new Company();
        Subscriber subscriber1=new Subscriber("sunny");
        Subscriber subscriber2=new Subscriber("Tom");
        Subscriber subscriber3=new Subscriber("Harry");
        company.registerObserver(subscriber1);
        company.registerObserver(subscriber2);
        company.registerObserver(subscriber3);
        company.publish();
    }
}
