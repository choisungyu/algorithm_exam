class Account {
    private static final int MIN_BALANCCE = 0;
    private static final int MAX_BALANCCE = 1000000;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance > MAX_BALANCCE) {
            balance = 10000;
        } else if (balance < MIN_BALANCCE){
            balance = 10000;
        }
        this.balance = balance;
    }

}

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(10000);
        System.out.println("현재잔고" + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재잔고" + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재잔고" + account.getBalance());

    }
}
