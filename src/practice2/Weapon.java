package practice2;

public class Weapon extends Item{

    public Weapon(String name) {
        super(name);
        System.out.println(name+"Weapon입니다.");
    }

    public Weapon(String name, int price) {
        super(name, price);
    }

    public Weapon() {
        super();
        System.out.println("Weapon");

    }
}
