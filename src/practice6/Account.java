package practice6;

public class Account {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Account) {
            Account account = (Account) o;
            if (accountNumber.trim().equals(account.accountNumber.trim())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return balance+"원 (계좌번호="+accountNumber+"))";
    }
}
