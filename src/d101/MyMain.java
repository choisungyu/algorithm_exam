package d101;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // 두 수를 입력하고 , 두 수가 홀수 짝수 쌍이면 yes, 둘 다 짝이거나 홀수이면 no
        Scanner sc = new Scanner(System.in);
        int inputX = sc.nextInt();
        int inputY = sc.nextInt();

        if (inputX % 2 == 0 && inputY % 2 != 0 || inputX % 2 != 0 && inputY % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
