package lab11.decorator.icecream;

public class HoneyToppingDecorator extends ToppingDecorator {
    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return super.getDescription() + addTopping();
    }

    public String addTopping() {
        return " + Honey Topping";
    }
}
