package d060;

public class MyScanner {
    public MyScanner(String str) {
        this.str = str;
    }

    private String str;


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "the best " + str;
    }
}
