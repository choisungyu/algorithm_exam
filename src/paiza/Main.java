package paiza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 공사장
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int R = scanner.nextInt();

        Gongsazang gongsazang = new Gongsazang(a, b, R);


        // 나무
        int N = scanner.nextInt();

        // 나무 갯수 객체 생성
        Tree[] trees = new Tree[N];

        // 그 나무의 x,y좌표 설정
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            trees[i] = new Tree(x, y);
        }
        Park park = new Park(gongsazang, trees);

        //출력 부분
//        for (int i = 0; i < N; i++) {
//            Tree tree = trees[i];
//            System.out.println(gongsazang.getSound(tree));
//        }
    }
}





//        for (int i = 0; i < N; i++) {
//            if ((coords[i][0] - a) * (coords[i][0] - a) + (coords[i][1] - b) * (coords[i][1] - b) >= R * R) {
//                System.out.println("silent");
//            } else {
//                System.out.println("noisy");
//            }
//        }
//    }
//}
//        int[][] coords = new int[N][2]; // {N,0}, {N,1} , {N+1,0} , {N+1,1}
//            Tree tree = trees[i];
//            tree.setX(x);
//            tree.setY(y);