package package1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int preyTime = 3;
        int recoveryAmount = preyTime + random.nextInt(preyTime);

        Cleric cleric = new Cleric();

        System.out.println("현재 마나 : " + cleric.mp);
        System.out.println("현재 체력 : " + cleric.hp);
        System.out.println("");

        cleric.selfAid();
        System.out.println("체력을 풀로 채웠습니다. -5만큼 마나가 깎입니다.");
        System.out.println("현재 마나 : " + cleric.mp);
        System.out.println("현재 체력 : " + cleric.hp);

        System.out.println("");
        System.out.println(String.format("%d초간 기도 한 결과, ", preyTime) + recoveryAmount + "만큼 마나가 회복이 되었습니다.");
        cleric.pray(recoveryAmount);

        System.out.println("현재 마나 : " + cleric.mp);
        System.out.println("현재 체력 : " + cleric.hp);


    }
}
