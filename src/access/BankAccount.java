package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : 입금 deposit 기능
    public void deposit(int amount){
        if (isAmountvalid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않는 금액입니다.");
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount){
        if (isAmountvalid(amount) && balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않는 금액입니다.");
        }
    }

    // public 메서드 : getBalance
    public int getBalance(){
        return balance;
    }

    // 입금액이 올바른 금액인지 확인하는 검증 로직
    private boolean isAmountvalid(int amount){
        return amount > 0;
    }
}
