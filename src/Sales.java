import java.util.Random;
import javax.swing.JOptionPane;

public class Sales {
    public static void main(String[] args) {
        MonthlyCarSales[] salesArray = new MonthlyCarSales[12];
        Random random = new Random();

        for (int i = 0; i < salesArray.length; i++) {
            double randomValue = random.nextDouble() * (500 - 2) + 2; // generate a random number between 2 and 500
            String Month = "Month " + (i + 1); // sale months are named as Month 1, Month 2, etc.

            salesArray[i] = new MonthlyCarSales(Month, randomValue);
        }

        MonthlyCarSales highestSale = salesArray[0];
        MonthlyCarSales lowestSale = salesArray[0];

        for (int i = 0; i < salesArray.length; i++) {
            MonthlyCarSales sales = salesArray[i];
            if (sales.getSaleValue() > highestSale.getSaleValue()) {
                highestSale = sales;
            }
            if (sales.getSaleValue() < lowestSale.getSaleValue()) {
                lowestSale = sales;
            }
        }

        String output = "Highest Sale:\nMonth: " + highestSale.getSaleMonth() + "\nSales Value: " + highestSale.getSaleValue()
                + "\n\nLowest Sale:\nMonth: " + lowestSale.getSaleMonth() + "\nSales Value: " + lowestSale.getSaleValue();

        JOptionPane.showMessageDialog(null, output, "Sales Analysis", JOptionPane.INFORMATION_MESSAGE);
    }
}
