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

    private genderType gender;
    private String photo;
    private String name;
    private Color color;
    private String brand;
    private double price;

    public genderType getGender() {
        return gender;
    }

    public void setGender(genderType gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
