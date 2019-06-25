package d003;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class MyMain {
    public static void main(String[] args) {
        //        [d002]
//        Scanner sc = new Scanner(System.in);
//        int inputX = sc.nextInt();
//        for (int i = 1; i <= 9; i++) {
//            System.out.print(inputX * i+" ");
//        }
        //        [d003]
//        Scanner sc = new Scanner(System.in);
//        int inputX = sc.nextInt();
//        int inputY = sc.nextInt();
//        int max = 0 ;
//        if (inputX > inputY) {
//            max = inputX;
//            System.out.println(max);
//        }
//        if (inputY > inputX) {
//            max = inputY;
//            System.out.println(max);
//        }
//        if (inputX == inputY) {
//            System.out.println("eq");
//        }
        //        [d005]
        // x y 를 받고 초기값 x에다가 y를 공차로 두고 9번 돌리기
        // 3 2
        // 3 5 7 9
//        Scanner sc = new Scanner(System.in);
//        int inputX = sc.nextInt(); // 3
//        int inputY = sc.nextInt(); // 2
//
//        System.out.print(inputX + " ");
//        for (int i = 0; i < 9; i++) {
//            inputX += inputY;
//            System.out.print(inputX + " ");
//        }
        //        [d006]
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        ArrayList<String> arrayList = new ArrayList<String>();
//
//        for (int i = 0; i < num; i++) {
//            String input = sc.next();
//            arrayList.add(input);
//        }
//        for (String anArrayList : arrayList) {
//            System.out.print(anArrayList+",");
//        }
        //        [d084]
//        Scanner sc = new Scanner(System.in);
//        int inputX = sc.nextInt();
//        int inputY = sc.nextInt();
//
//        if (inputX == inputY || inputX == 11 && inputY == 1) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
        //        [d071]
//        Scanner sc = new Scanner(System.in);
//        int inputX = sc.nextInt();
//        int inputY = sc.nextInt();
//        if (inputX >= 25 || inputY <= 40) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//
//        }
        //        [d076]
//        Scanner sc = new Scanner(System.in);
//        String inputX = sc.next();
//        String inputY = sc.next();
//        if (inputY.contains(inputX)) {
//            System.out.println("NG");
//        } else {
//            System.out.println(inputY);
//        }
        //        [d082]

//        Scanner sc = new Scanner(System.in);
//        String inputX = sc.next();
//        String inputY = sc.next();
//
//        int lengthX = inputX.length() - 1;
//        int lengthY = inputY.length() - 1;
//
//        String charX = String.valueOf(inputX.charAt(lengthX));
//        String charY = String.valueOf(inputY.charAt(0));
//        String charZ = String.valueOf(inputY.charAt(lengthY));
//        if (charX.equals(charY)) {
//            if (charZ.equals("n")) {
//                System.out.println("NG");
//
//            } else if (!charY.equals("n")) {
//                System.out.println("OK");
//            }
//        } else {
//            System.out.println("NG");
//        }

        // x뒷자리와 y앞자리 같고 y의 뒷자리가 n이 아니면 ok
        // x뒷자리와 y앞자리가 다르고 y의 뒷자리가 n이면 no

        //        [d096]

//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> ints = new ArrayList<Integer>();
//        for (int i = 0; i < 6; i++) {
//            ints.add(sc.nextInt());
//        }
//
//        double output1 = ints.get(2) / ints.get(0) * ints.get(1);
//        double output2 = ints.get(5) / ints.get(3) * ints.get(4);
//
//        if (output1 < output2) {
//            System.out.print(ints.get(0));
//            System.out.print(" ");
//            System.out.print(ints.get(1));
//            System.out.print(" ");
//            System.out.print(ints.get(2));
//        } else {
//            System.out.print(ints.get(3));
//            System.out.print(" ");
//            System.out.print(ints.get(4));
//            System.out.print(" ");
//            System.out.print(ints.get(5));
//        }
//        if (output1 == output2) {
//            System.out.println("DRAW");
//        }
        //        [d63]
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> array = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            array.add(sc.nextInt());
//        }
//        int input = sc.nextInt();
//
//        if (array.get(0) > input) {
//            System.out.println(1);
//
//        } else if (array.get(0) < input && array.get(1) > input) {
//            System.out.println(2);
//
//        } else if (array.get(1) < input && array.get(2) > input) {
//            System.out.println(3);
//
//        } else if (array.get(2) < input && array.get(3) > input) {
//            System.out.println(4);
//
//        } else if (array.get(3) < input && array.get(4) > input) {
//            System.out.println(5);
//
//        } else if (array.get(4) < input && array.get(5) > input) {
//            System.out.println(6);
//        }
        //        [d79]
//        // AABAA
//        // AAAAAA a가 0번째에도 1번째에도 ... 마지막번째에도 다~있으면 같은거
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String firstStr = String.valueOf(str.charAt(0));
//        String strChar = "";
//        for (int i = 0; i < str.length(); i++) {
//            strChar = String.valueOf(str.charAt(i));
//            if (!strChar.equals(firstStr)) {
//                System.out.println("OK");
//                break;
//            }
//        }
//        if (strChar.equals(firstStr)) {
//            System.out.println("NG");
//        }
//    }
        //      물어볼것
//        Scanner sc = new Scanner(System.in); // 사용자의 입력을 받을 Scanner 객체 생성
//        String inputStr = sc.nextLine(); // 사용자가 입력한 문자열(한 문장)을 inputStr에 저장
//        String result = ""; // 중복이 되지 않은 문자열을 저장할 문자열 생성
//
//        for(int i = 0; i < inputStr.length(); i++) { // i가 0부터 사용자가 입력한 문자열의 길이만큼 반복문을 돌린다.
//            if(!result.contains(String.valueOf(inputStr.charAt(i)))) { // 사용자가 입력받은 문자열의 i번째 문자를 String으로 바꾸고 result에 이 문자가 포함되어 있지 않다면
//                result += String.valueOf(inputStr.charAt(i));  // result에 계속 추가, 즉 중복되지 않으면 추가
//            }
//        }
//        System.out.println(result);
        //         피고나치 수열
//        int var1 = scanner.nextInt();
//        int var2 = scanner.nextInt();
//        int var3 = 0;
//        System.out.print(var1+" ");
//        for (int i = 0; i < 10; i++) {
//            var3 = var1 + var2;
//            var1 = var2;
//            var2 = var3;
////            if (i < 9) {
////                System.out.print(var2+" ");
////            } else if (i == 9) {
////                System.out.println(var2+"");
////            }
//
//        }
        //        [d096]
        //        Scanner scanner = new Scanner(System.in);
        //        String str = scanner.next();
        //        if (str.contains("I") || str.contains("l") || str.contains("i")) {
        //            System.out.println("caution");
        //        } else {
        //            System.out.println(str);
        //        }


    }
}