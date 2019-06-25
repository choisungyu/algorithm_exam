package practice1;

public class Wand {
    private String name;
    private double power;

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

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
//        if (power > 100) {
//            throw new IllegalArgumentException("마력이 넘칩니다.");
//        } else if (power < 0.5) {
//            throw new IllegalArgumentException("마력이 모자릅니다.");
//        }
//        this.power = power;
        if (0.5 <= power && power <= 100) {
            this.power = power;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
