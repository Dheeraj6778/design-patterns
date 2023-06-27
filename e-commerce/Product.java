public class Product {
    private String productId;
    private String productName;
    private int cost;
    public Product(String productId,String productName, int cost){
        this.productId=productId;
        this.productName=productName;
        this.cost=cost;
    }
    public String getProductId() {
        return productId;
    }

    public int getCost() {
        return cost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Product name is "+getProductName()+"\n");
        sb.append("cost is "+Integer.toString(getCost())+"\n");
        sb.append("product id is "+getProductId()+"\n");
        return sb.toString();
    }
}
