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
}
