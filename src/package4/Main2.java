package package4;

public class Main2 {
    public static void main(String[] args) {
        X obj = new A();
        A a = (A) obj;
        a.a();
        a.b();
        A a1 = new A();
        a1.a();

        obj.a();
        obj.b();
        Y y1 = new A();
        y1.a();
        y1.b();
        Y y2 = new B();
        y2.a();
        y2.b();
    }
}
