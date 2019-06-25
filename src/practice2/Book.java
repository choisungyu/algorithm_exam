package practice2;

public class Book extends TangibleAsset implements Thing{
    private String isbn;
    private double weight;

    public Book(String name, int price, String color, String isbn) {
        super(name,price,color);
        this.isbn = isbn;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public int getPrice() {
        return super.getPrice();
    }

    public void setPrice(int price) {
        super.setPrice(price);
    }

    public String getColor() {
        return super.getColor();
    }

    public void setColor(String color) {
        super.setColor(color);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
