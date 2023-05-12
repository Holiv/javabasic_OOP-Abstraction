import java.util.ArrayList;

public class Store {
    public record OrderItem(int qty, ProductForSale product) {
    }

    public static void main(String[] args) {
        ProductA product1 = new ProductA(10, "First Product");
        ProductB product2 = new ProductB(20, "Second Product");
        ProductC product3 = new ProductC(30, "Third Product");
        ProductA product4 = new ProductA(40, "Forth Product");
        ProductB product5 = new ProductB(50, "Fifth Product");
        ProductC product6 = new ProductC(60, "Sixth Product");

        ArrayList<ProductForSale> productForSales = new ArrayList<>();
        productForSales.add(product1);
        productForSales.add(product2);
        productForSales.add(product3);
        productForSales.add(product4);
        productForSales.add(product5);
        productForSales.add(product6);

        ArrayList<OrderItem> orderItemsList = new ArrayList<>();

        for (ProductForSale product : productForSales) {
            System.out.println(product.type);
            System.out.println(product.price);
            System.out.println(product.description);
            System.out.println("_".repeat(10));
        }

        for (int i = 0; i < productForSales.size(); i++) {
            addItemToOrder(orderItemsList, i + 1, productForSales.get(i));
        }

//        for (ArrayList)
    }

    public static void addItemToOrder(ArrayList<OrderItem> orderList, int qty, ProductForSale product) {
        System.out.println(qty + " " + product.description + "is being added to the order");
        System.out.println("The item order price is: " + product.getSalesPrice(qty));
        System.out.println("_".repeat(5));

        OrderItem itemAdd = new OrderItem(qty, product);
        orderList.add(itemAdd);

        double orderPrice = 0;
        for (OrderItem orderItems : orderList) {
            orderPrice += orderItems.product.getSalesPrice(orderItems.qty);
        }
        System.out.println("The current order price is: " + orderPrice);
        System.out.println("_".repeat(10));
    }
}
