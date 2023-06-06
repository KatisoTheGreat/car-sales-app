public class MonthlyCarSales {
    private String saleMonth;
    private double saleValue;

    public MonthlyCarSales() {
    }

    public MonthlyCarSales(String mth, double val) {
        saleMonth = mth;
        saleValue = val;
    }

    public void setSaleMonth(String nm) {
        saleMonth = nm;
    }

    public void setSaleValue(double val) {
        saleValue = val;
    }

    public String getSaleMonth() {
        return saleMonth;
    }

    public double getSaleValue() {
        return saleValue;
    }

    @Override
    public String toString() {
        return "Month: " + saleMonth + ", Value: " + saleValue;
    }
}
