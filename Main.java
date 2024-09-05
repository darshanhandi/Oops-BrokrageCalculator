
public class Main {
    public static void main(String[] args) {
        BrokerageCalculator equityCalc = new EquityBrokerageCalculator(100, 120, 50);
        System.out.println("Equity Brokerage without taxes: " + equityCalc.calculateBrokerage());
        System.out.println("Equity Brokerage with taxes: " + equityCalc.calculateBrokerage(true));

        BrokerageCalculator commodityCalc = new CommodityBrokerageCalculator(100, 120, 50);
        System.out.println("Commodity Brokerage without taxes: " + commodityCalc.calculateBrokerage());
        System.out.println("Commodity Brokerage with taxes: " + commodityCalc.calculateBrokerage(true));
    }
}
