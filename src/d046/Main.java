package d046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputX = sc.nextInt();
        int inputY = sc.nextInt();
        int inputZ = sc.nextInt();

        int max = 0;

        if (inputX >= inputY && inputX >= inputZ) {
            max = inputX;
        } else if (inputY >= inputX && inputY >= inputZ) {
            max = inputY;
        } else if (inputZ >= inputX && inputZ >= inputY) {
            max = inputZ;
        }
        System.out.println(max);

    }
}
