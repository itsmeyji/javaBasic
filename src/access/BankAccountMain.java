package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        System.out.println("balance : "+account.getBalance());


        account.deposit(-2000);
        System.out.println("balance : "+account.getBalance());

        account.withdraw(4400);
        System.out.println("balance : "+account.getBalance());
    }
}
