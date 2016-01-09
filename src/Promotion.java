import java.util.Date;

/**
 * Created by Damian on 26.11.2015.
 */
public class Promotion {
    private Date startDate;
    private Date endDate;
    private double priceReduction;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPriceReduction() {
        return priceReduction;
    }

    public void setPriceReduction(double priceReduction) {
        this.priceReduction = priceReduction;
    }
}
