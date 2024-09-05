
public class CommodityBrokerageCalculator extends BrokerageCalculator {

    public CommodityBrokerageCalculator(double buyPrice, double sellPrice, int quantity) {
        super(buyPrice, sellPrice, quantity);
    }

    @Override
    public double calculateBrokerage() {
        double turnover = getBuyPrice() * getQuantity() + getSellPrice() * getQuantity();
        return turnover * 0.0005; // Assume 0.05% brokerage for commodities
    }
}
