/**
 * Created by Damian on 23.11.2015.
 */
public class Trousers extends Clothes {
    private int waistSize;
    private int length;
    private String material;
    private Promotion promotion;

    public int getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(int waistSize) {
        this.waistSize = waistSize;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "waistSize=" + waistSize +
                ", length=" + length +
                ", material='" + material + '\'' +
                ", promotion=" + promotion +
                '}';
    }




}
