package practice2;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int R = scanner.nextInt();

        int N = scanner.nextInt();
        int[][] coords = new int[N][2]; // {N,0}, {N,1} , {N+1,0} , {N+1,1}
        for (int i = 0; i < N; i++) {
            coords[i][0] = scanner.nextInt(); // x
            coords[i][1] = scanner.nextInt(); // y
        }
        for (int i = 0; i < N; i++) {
            if ((coords[i][0] - a) * (coords[i][0] - a) + (coords[i][1] - b) * (coords[i][1] - b) >= R * R) {
                System.out.println("silent");
            } else {
                System.out.println("noisy");
            }
        }
    }
}
