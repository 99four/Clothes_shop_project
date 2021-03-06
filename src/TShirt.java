/**
 * Created by Damian on 23.11.2015.
 */
public class TShirt extends Shirt {
    public enum sizeType {
        XS, S, M, L, XL, XXL;
    }

    private sizeType size;

    public sizeType getSize() {
        return size;
    }

    public void setSize(sizeType size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "brand='" + brand + '\'' +
                ", gender=" + gender +
                ", photo='" + photo + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", price=" + price +
                "size=" + size +
                '}';
    }

}
