package lab11.decorator.icecream;

public class NutsToppingDecorator extends ToppingDecorator {
    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return super.getDescription() + addTopping();
    }

    public String addTopping() {
        return " + Nuts Topping";
    }
}
