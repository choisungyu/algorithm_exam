package practice1;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void setWand(Wand wand) {
//        if (wand == null) {
//            throw new IllegalArgumentException("wand가 null 일 수 없다.");
//        }
//        this.wand = wand;
        if (wand != null) {
            this.wand = wand;
        } else {
            throw new IllegalArgumentException("wand가 null일 수 없다.");
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("체력이 0 이상이어야 합니다.");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마력이 0 이상이어야 합니다.");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름이 null이 아니어야 함");
        } else if (name.length() < 3) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }
        this.name = name;
    }

    void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }
}
