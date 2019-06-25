package package4;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Y[] array = new Y[2];
        array[0] = a;
        array[1] = b;

        for (Y y : array) {
            y.b(); // A클, B클 모두 묶어서 array에 담고 A B에 대한 둘다 b메소드 모두 호출 / y에 대한 b메소드 모두 호출 / 부대 이동할 때 쓰기 좋은듯...
        }
    }

}