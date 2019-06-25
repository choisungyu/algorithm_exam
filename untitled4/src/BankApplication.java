import java.util.Scanner;

class Account {
    private String ano;
    private String owner;
    private int balance;

    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}


public class BankApplication {

    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("1.ㄱㅈㅈㅂ 2.ㄱㅈㅁㄹ 3.ㅇㄱ 4.ㅊㄱ 5.ㅈㄹ");
            System.out.print(">선택>");
            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
            System.out.println("종료");
        }
    }

    private static void withdraw() {
        System.out.println("출금-----------");

    }

    private static void deposit() {
        System.out.println("입금-----------");
        System.out.print("계좌번호>");
        String ano = scanner.next();
        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("계좌없음");
            return;
        }

        System.out.print("예금액>");
        int money = scanner.nextInt();

        account.setBalance(account.getBalance() - money);
        System.out.print("예금성공");


    }



    private static Account findAccount(String ano) {

        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;

                }
            }
        }

        return account;
    }


    private static void accountList() {
        System.out.println("계좌조회-----------");
        for (int i = 0; i < accountArray.length; i++) {


            Account account = accountArray[i];

            if (account != null) {

                System.out.println(account.getOwner());
                System.out.println(account.getAno());
                System.out.println(account.getBalance());
            }
        }
    }

    private static void createAccount() {
        System.out.println("계좌생성-----------");
        System.out.print("계좌번호> ");
        String ano = scanner.next();

        System.out.print("계좌명ㅇ> ");
        String owner = scanner.next();

        System.out.println("계좌잔액> ");
        int balance = scanner.nextInt();

        Account account = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {

                accountArray[i] = account;
                System.out.println("계좌생성");
                break;
            }

        }

    }
}
