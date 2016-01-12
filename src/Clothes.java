/**
 * Created by Damian on 23.11.2015.
 */
public class Clothes {

    public enum genderType {
        MALE, FEMALE;
    }

    public enum Color {
        RED, BLUE, GREEN, BLACK, YELLOW, WHITE;
    }

    protected genderType gender;
    protected String photo;
    protected String name;
    protected Color color;
    protected String brand;
    protected double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public genderType getGender() {
        return gender;
    }

    public void setGender(genderType gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "brand='" + brand + '\'' +
                ", gender=" + gender +
                ", photo='" + photo + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
