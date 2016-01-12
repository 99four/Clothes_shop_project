/**
 * Created by Damian on 23.11.2015.
 */
public class Shoes extends Clothes {
    private int size;
    private boolean hasHeel;
    private Promotion promotion;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHasHeel() {
        return hasHeel;
    }

    public void setHasHeel(boolean hasHeel) {
        this.hasHeel = hasHeel;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "size=" + size +
                ", hasHeel=" + hasHeel +
                ", promotion=" + promotion +
                "brand='" + brand + '\'' +
                ", gender=" + gender +
                ", photo='" + photo + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
