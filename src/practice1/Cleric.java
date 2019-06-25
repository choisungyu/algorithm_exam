package practice1;

import java.util.Random;

public class Cleric {

    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    String name;
    int hp = MAX_HP;
    int mp = MAX_MP;

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;

    }

    Cleric(String name, int hp) {
//        this.name = name;
//        this.hp = hp;
//        mp = MAX_MP;
        this(name, hp, MAX_MP);

    }

    Cleric(String name) {
        this(name, MAX_HP);
//        this.name = name;
//        hp = MAX_HP;
//        mp = MAX_MP;

    }



    void selfAid() {
        mp -= 5;
        hp = MAX_HP;
        if (mp < 0) {
            mp = 0;
        }
    }

    int pray(int preyTime) {

        int point = new Random().nextInt(preyTime); // 3 인자 받으면, 0 1 2 == point
        int recoveryMp = point + preyTime; // (0~2) + 3 = 회복량

        int beforeMp = mp; // 10

        mp += recoveryMp; // mp == 10+3+(0~2)

        if (mp > MAX_MP) {
            mp = MAX_MP;
        }
        return Math.min(mp, MAX_MP) - beforeMp; // 15,10 = 10 - 10
//        return mp;
    }




}
/*public class Cleric {
    final int MAX_HP = 50;
    final int MAX_MP = 10;

    String name;
    int hp = MAX_HP;
    int mp = MAX_MP;

    void selfAid() {
        // MP 5 소비
        mp = mp - 5;    // mp -= 5;

        // HP 최대 HP로 회복
        hp = MAX_HP;
    }

    int pray(int sec) {
        // 회복량은 기도한 시간(초)에 랜덤하게 0 ~ 2포인트의 보정을 한 양이다
        int point = new Random().nextInt(3);    // 보정량
        int recoverMp = sec + point;        // 회복량 = 초 + 보정량

        // 회복 전 MP
        int beforeMp = mp;

        // (3초 기도하면 회복량은 3 ~ 5 포인트).
        mp = mp + recoverMp;
        // 단, 최대 MP 보다 더 회복하는 것은 불가능 하다.

//        if (mp > MAX_MP) {
//            mp = MAX_MP;
//        }

        // 리턴 값은 “실제로 회복된 MP 양" 을 반환한다.
        return Math.min(mp, MAX_MP) - beforeMp;
    }
}*/
