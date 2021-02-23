public class Cloth extends Product {
    private String size;

    public Cloth(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
