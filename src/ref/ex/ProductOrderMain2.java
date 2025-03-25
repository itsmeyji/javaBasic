package ref.ex;

public class ProductOrderMain2 {
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder orders = new ProductOrder();
        orders.productName = productName;
        orders.price = price;
        orders.quantity = quantity;

        return orders;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder o : orders){
            System.out.printf("상품명 : %s,\t가격 : %d,\t수량 : %d", o.productName, o.price, o.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for (ProductOrder ord : orders){
            sum += (ord.price * ord.quantity);
        }
        return sum;
    }

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        createOrder("두부", 2000, 1);
        createOrder("두부", 2000, 1);
        createOrder("두부", 2000, 1);
    }
}