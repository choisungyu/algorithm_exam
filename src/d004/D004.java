package d004;

import java.util.ArrayList;
import java.util.Scanner;

public class D004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < num; i++) {
            arrayList.add(scanner.next());
        }
        System.out.print("Hello ");
        for (int i = 0; i < arrayList.size(); i++) {

            if (i == num - 1) {
                System.out.print(arrayList.get(i) + ".");
            } else {
                System.out.print(arrayList.get(i) + ",");
            }
        }

//        System.out.println(arrayList);
    }


//        for (int i = 0; i < num; i++) {
//
//            String str = scanner.nextLine(); // paiza, gino
//            String sum = str;
//
//            if (i < num -1) {
//                sum = str + ",";
//
//            } else if (i == num - 1) {
//                sum = str + ".";
//
//            }
//            System.out.print(sum);
//        }

}
