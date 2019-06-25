package practice1;

public class PoisonKinoko extends Kinoko {

//    public int getPoisonAttackPoint() {
//        return poisonAttackPoint;
//    }
//
//    public void setPoisonAttackPoint(int poisonAttackPoint) {
//        this.poisonAttackPoint = poisonAttackPoint;
//    }

    private int poisonAttackPoint;

    public PoisonKinoko(String suffix) {
        super(suffix);
        poisonAttackPoint = 5;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);
        if (poisonAttackPoint > 0) {
            System.out.println("독 포자를 살포했다!");
        }
        int damage = hero.getHp() / 5;
        hero.setHp(hero.getHp() - damage);
        System.out.println(damage + "포인트의 데미지");

//        poisonKinoko.poisonAttackPoint -= 1;
        poisonAttackPoint --;
    }

}
