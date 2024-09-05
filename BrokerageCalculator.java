
public abstract class BrokerageCalculator {
    private double buyPrice;
    private double sellPrice;
    private int quantity;

    public BrokerageCalculator(double buyPrice, double sellPrice, int quantity) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method to calculate brokerage
    public abstract double calculateBrokerage();

    // Method overloading example
    public double calculateBrokerage(boolean includeTaxes) {
        double brokerage = calculateBrokerage();
        if (includeTaxes) {
            brokerage += calculateTaxes();
        }
        return brokerage;
    }

    // Protected method to calculate taxes (can be overridden)
    protected double calculateTaxes() {
        return 0.18 * calculateBrokerage(); // 18% tax
    }
}
