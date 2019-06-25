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
            System.out.println("1.ㄱㅈㅈㅂ 2.ㄱㅈㅁㄹ 3.출금 4.입금 5.ㅈㄹ");
            System.out.print(">선택>");
            int flag = scanner.nextInt();

            if (flag==1) {
                createAccount();

            } else if (flag == 2) {
                accountList();

            } else if (flag == 3) {
                withdraw();

            } else if (flag == 4) {
                deposit();

            } else if (flag == 5) {
                run = false;
            }
        }
        System.out.print("종료");
    }

    private static void withdraw() {
        System.out.println("출금-----------");
        System.out.print("계좌번호>");
        String ano = scanner.next();
        System.out.print("출금액>");
        int money = scanner.nextInt();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.print("출금성공");


    }

    private static void deposit() {
        System.out.println("예금-----------");
        System.out.print("계좌번호>");
        String ano = scanner.next();
        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("계좌가 없습니다.");
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
                // 가져온 dbAno랑 지금 입력한 ano랑 같은가 , 같으면 account에 저장 후 return
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }


    private static void accountList() {
        System.out.println("계좌목록-----------");
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];

            if (account != null) {
                System.out.print(account.getAno());
                System.out.print("      ");
                System.out.print(account.getBalance());
                System.out.print("      ");
                System.out.print(account.getOwner());
                System.out.print("      ");
                System.out.println("");

            } else {
                System.out.println("게좌없음");
                break;
            }

        }

    }

    private static void createAccount() {

        System.out.println("계좌생성-----------");
        System.out.print("계좌번호> ");
        String ano = scanner.next();

        System.out.print("계좌주> ");
        String owner = scanner.next();

        System.out.print("입금액> ");
        int balance = scanner.nextInt();

        Account account = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            // accountArray가 만약 null 일시에 체워넣겠다.
            if (accountArray[i] == null) {
                accountArray[i] = account;
                System.out.println("계좌 생성됨----------");
                break;
            }

        }

    }

}
