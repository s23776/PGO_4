public class Product {

    private String name;
    private int price;
    private int productCode;
    private int numberOfUnits;

    public Product(String name, int price, int productCode, int numberOfUnits) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfUnits = numberOfUnits;
    }

    public Product(String name, int price, int productCode) {
        this(name, price, productCode, 0);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getProductCode() {
        return productCode;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        if(numberOfUnits >= 0)
            this.numberOfUnits = numberOfUnits;
    }
}
