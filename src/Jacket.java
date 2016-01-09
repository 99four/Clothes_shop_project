/**
 * Created by Damian on 23.11.2015.
 */
public class Jacket extends Clothes {
    public enum season {
        SPRING, SUMMER, AUTUMN, WINTER;
    }

    private int size;
    private String claspType;
    private String material;
    private season seasonType;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getClaspType() {
        return claspType;
    }

    public void setClaspType(String claspType) {
        this.claspType = claspType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public season getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(season seasonType) {
        this.seasonType = seasonType;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "size=" + size +
                ", claspType='" + claspType + '\'' +
                ", material='" + material + '\'' +
                ", seasonType=" + seasonType +
                '}';
    }
}
