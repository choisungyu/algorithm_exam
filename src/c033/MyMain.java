package c033;

import java.util.ArrayList;
import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            String hit = scanner.nextLine();

            if (hit.equals("ball")) {
                ArrayList<String> ballArrayList = new ArrayList<>();
                ballArrayList.add(hit);
                System.out.println("ball!");

                if (ballArrayList.size() == 3) {
                    String fourball = "fourball";
                    ballArrayList.remove(3);
                    ballArrayList.add(3, fourball);
                    System.out.println(fourball);
                }

            }
            if (hit.equals("strike")) {
                ArrayList<String> strikeArrayList = new ArrayList<>();
                strikeArrayList.add(hit);
                System.out.println("strike!");

                if (strikeArrayList.size() == 2) {
                    String strike = "strike!";
                    strikeArrayList.remove(2);
                    strikeArrayList.add(2, strike);
                    System.out.println(strike);
                }
            }


        }


    }
}
