package poly.ex.pay1;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제수단을 찾지 못했습니다");
        return false;
    }
}
