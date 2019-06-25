package c016;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
//        String str = "ABCDEFG";
//        System.out.println(str.substring(3));
//        System.out.println(str.substring(3,6));
//        System.out.println(str.length());
//        System.out.println(str.substring(3,7));
//
//        String str1 = "ABCD/DEFGH";
//        System.out.println(str1.length());
//        String result = str1.substring(str1.length() - 3, str1.length()); // 7,10
//        System.out.println(result);

//        String str = "ABCD/DEFGH";
//        String result = str.substring(str.lastIndexOf("/") + 1);
//        String result2 = str.substring(str.lastIndexOf("/") + 2);
//        System.out.println(result);
//        System.out.println(result2);
//        String str = "";
//
//        for (int i = 0; i < 5; i++) {
//            str += i + "#";
//        }
//        System.out.println(str);
//
//        String[] array = str.split("#");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("array[" + i + "] = ");
//            System.out.println(i);
//        }
//
//        String str1 = "A,B,C,D";
//        String[] array1 = str1.split(",");
//
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
//        String line1 = line.replace("A", "4");
//        String line2 = line1.replace("E", "3");
//        String line3 = line2.replace("G", "6");
//        String line4 = line3.replace("I", "1");
//        String line5 = line4.replace("O", "0");
//        String line6 = line5.replace("S", "5");
//        String line7 = line6.replace("Z", "2");
//        System.out.println(line7);

        String replace = line.replace("A","4").replace("E","3").replace("G", "6").replace("I", "1");
        System.out.println(replace);


//        if (line.contains("A")) {
//            line = line.replace("A", "4");
//        }
//        if (line.contains("I")) {
//            line = line.replace("I", "1");
//        }
//        if (line.contains("Z")) {
//            line = line.replace("Z", "2");
//        }
//        System.out.println(line);
//
//
//        for (int i = 0; i < line.length(); i++) {
//            if (line.contains("A")) {
//                line = line.replace("A", "4");
//
//            } else if (line.contains("I")) {
//                line = line.replace("I", "1");
//
//            } else if (line.contains("Z")) {
//                line = line.replace("Z", "2");
//
//            }
//            System.out.println(line);
//        }


    }

}
