public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(double price, String description) {
        this.type = this.getClass().getName();
        this.price = price;
        this.description = description;
    }

    protected abstract void printPricedItem(int qty);
    protected double getSalesPrice(double qty) {
        return qty * this.price;
    }

}
