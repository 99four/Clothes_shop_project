/**
 * Created by Damian on 23.11.2015.
 */
public class Elegant extends Shirt {
    private int collarSize;
    private boolean hasTie;

    public int getCollarSize() {
        return collarSize;
    }

    public void setCollarSize(int collarSize) {
        this.collarSize = collarSize;
    }

    public boolean isHasTie() {
        return hasTie;
    }

    public void setHasTie(boolean hasTie) {
        this.hasTie = hasTie;
    }

    @Override
    public String toString() {
        return "Elegant{" +
                "collarSize=" + collarSize +
                ", hasTie=" + hasTie +
                '}';
    }
}
