package d060;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        MyScanner myScanner = new MyScanner(str);
        System.out.println(myScanner.toString());

    }
}