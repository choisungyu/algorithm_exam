import java.util.ArrayList;
import java.util.Scanner;

public class IsVonel {
    public static void main(String[] args) {

//        System.out.println(isVonel(scanner().next()));
        System.out.println(factorial(3));
    }

    public static boolean isVonel(String str) {

        scanner();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("e");
        arrayList.add("i");
        arrayList.add("o");
        arrayList.add("u");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("I");
        arrayList.add("O");
        arrayList.add("U");

        for (String strs : arrayList) {
            if (strs.equals(str)) {
                return true;
            }
        }
        return false;

//        if (arrayList.equals(str)) {
//            isVonel = true;
//        } else if (!arrayList.equals(str)) {
//
//            isVonel = false;
//        }
//        return isVonel;
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }


}
