package practice2;

public abstract class TangibleAsset {
    private String name;
    private int price;
    private String color;

    public TangibleAsset(String name, int price, String color) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
