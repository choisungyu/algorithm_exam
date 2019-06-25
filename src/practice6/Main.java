package practice6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Account a = new Account("4649", 1592);
        Account b = new Account("4649", 1234);
        System.out.println(a.toString());

        System.out.println(a.equals(b));

        String ab = null;
        System.out.println(Objects.isNull(ab));

        ArrayList list = new ArrayList();
        list.add(10);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayList<String> stringArrayList = new ArrayList<String>(); // 뒤에 안써도 됨
        List<String> stringList = new ArrayList<>(); // 일반적






    }
}
