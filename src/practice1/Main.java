package practice1;

public class Main {
    public static void main(String[] args) {

        Cleric cleric = new Cleric("클레릭");
        Wizard wizard = new Wizard();
        wizard.setHp(-1);
        wizard.setHp(-1);

        cleric.selfAid();
        System.out.println(cleric.mp);
        System.out.println(cleric.hp);

        cleric.selfAid();
        System.out.println(cleric.mp);
        System.out.println(cleric.hp);

        cleric.selfAid();
        cleric.pray(3);
        cleric.selfAid();
        System.out.println(cleric.mp);
        System.out.println(cleric.hp);


        cleric.pray(5);

        cleric.selfAid();
        System.out.println(cleric.mp);
        System.out.println(cleric.hp);



//        cleric.selfAid();
//        cleric.selfAid();
//        System.out.println("체력을 풀로 채웠습니다. -5만큼 마나가 깎입니다.");
//        System.out.println("현재 마나 : " + cleric.mp);
//        System.out.println("현재 체력 : " + cleric.hp);
//
//
////        System.out.println(String.format("%d초간 기도 한 결과, ", preyTime) + recoveryAmount + "만큼 마나가 회복이 되었습니다.");
////        cleric.pray(recoveryAmount);
//
//        System.out.println("현재 마나 : " + cleric.mp);
//        System.out.println("현재 체력 : " + cleric.hp);


    }
}
