package ProductOrder;

public class ProcuctOrderMain {
    public static void main(String[] args) {
        // 배열 생성
        ProductOrder[] ordArr = new ProductOrder[3];

        ProductOrder ord1 = new ProductOrder();
        ord1.productName = "두부";
        ord1.price = 2000;
        ord1.quantity = 2;
        ordArr[0] = ord1;

        ProductOrder ord2 = new ProductOrder();
        ord2.productName = "김치";
        ord2.price = 5000;
        ord2.quantity = 1;
        ordArr[1] = ord2;

        ProductOrder ord3 = new ProductOrder();
        ord3.productName = "콜라";
        ord3.price = 1500;
        ord3.quantity = 2;
        ordArr[2] = ord3;

        for (ProductOrder s : ordArr) {
            System.out.printf("상품명 : %s, 가격 : %d, 수량 : %d\n", s.productName, s.price, s.quantity);
        }
        System.out.printf("총 결제 금액 : %d", (ord1.price*ord1.quantity)+(ord2.price*ord2.quantity)+(ord3.price*ord3.quantity));

    }
}
