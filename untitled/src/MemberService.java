class MemberServiceExample{

    public MemberServiceExample() {

    }

    private String id;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else
            return false;

    }

    void logout(String id) {
        if (id.equals("hong")) {
            System.out.println("로그아웃");
        }

    }
}

public class MemberService{
    public static void main(String[] args) {
        MemberServiceExample example = new MemberServiceExample();
        boolean result = example.login("hong", "12345");
        if (result) {
            System.out.println("로그인");
            example.logout("hong");
        } else {
            System.out.println("id || password 불일치");
        }

    }
}