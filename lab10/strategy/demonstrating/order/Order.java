package lab10.strategy.demonstrating.order;

import lab10.strategy.demonstrating.strategies.PayStrategy;

/**
 * Order class. Doesn't know the concrete payment method (strategy) user has picked.
 * It uses common strategy interface to delegate collecting payment data to strategy object.
 * It can be used to save order to database.
 */

public class Order {
    private static Order instance = null;
    private int totalCost = 0;
    private boolean isClosed = false;

    public Order() {}

    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }

    public void processOrderUsingPaypal(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void processOrderUsingCreditCard(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }

    public void processOrderByPaypal(PayStrategy strategy) {
    }

    public void processOrderByCreditCard(PayStrategy strategy) {
    }
}
