public class StoreLemonade {
    // instance fields
    String productType;

    // constructor method
    public StoreLemonade(String product) {
        productType = product;
    }

    // main method
    public static void main(String[] args) {
        StoreLemonade lemonadeStand = new StoreLemonade("lemonade");
        System.out.println(lemonadeStand.productType);

    }
}
