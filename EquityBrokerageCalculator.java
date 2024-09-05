
public class EquityBrokerageCalculator extends BrokerageCalculator {

    public EquityBrokerageCalculator(double buyPrice, double sellPrice, int quantity) {
        super(buyPrice, sellPrice, quantity);
    }

    @Override
    public double calculateBrokerage() {
        double turnover = getBuyPrice() * getQuantity() + getSellPrice() * getQuantity();
        return turnover * 0.001; // Assume 0.1% brokerage for equity
    }

    @Override
    protected double calculateTaxes() {
        return super.calculateTaxes() + 0.0005 * getSellPrice() * getQuantity(); // Add additional charges
    }
}
