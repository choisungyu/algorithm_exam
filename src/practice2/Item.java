package practice2;

public class Item {
    private String name;
    private int price;

    Item() {
        System.out.println("Item");
    }

    public Item(String name) {
        this.name = name;
        price = 0;
        System.out.println(name+"Item입니다");
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
