package package1;

class Cleric {

    String name;
    int hp = MAX_HP;
    int mp = MAX_MP;
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    void selfAid() {

        mp = mp - 5;
        if (mp < 5) {
            mp = 0;
        }
        hp = MAX_HP;
    }

    /***
     * asdsd
     * @param recoveryAmount
     * @return
     */
    int pray(int recoveryAmount) {



        // mp가 5 이하 일 때, 마나가 0으로 고정시킴
        if (mp >= 5) {
            mp = mp + recoveryAmount + 1;
        } else {
            mp = mp + recoveryAmount;
        }

        // mp가 10 이상 일 때, 최대치 max로 고정
        if (mp >= 10) {
            mp = MAX_MP;
        }
        return mp;
    }


}
