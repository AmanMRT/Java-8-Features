package Stream_API;

public class ProductInfo {
    private String name;
    private String productcode;
    private double price;
    private int quantity;
    
    
    public ProductInfo(String name, String code, double price, int quantity) {
        super();
        this.name = name;
        this.productcode = code;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProductCode() {
        return productcode;
    }
    public void setProductCode(String upc) {
        this.productcode = upc;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "ProductInfo [name=" + name + ", upc=" + productcode + ", price=" + price + ", quantity=" + quantity + "]";
    }
    
    
}