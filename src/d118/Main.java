package d118;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int inputY = sc.nextInt();
        if (input.equals("S")) {

            int output = 1925;
            System.out.println(output+ inputY);

        } else if (input.equals("H")) {
            int output = 1988;
            System.out.println(output +inputY);
        }
    }
}
