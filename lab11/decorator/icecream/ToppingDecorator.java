package lab11.decorator.icecream;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription();
    }

    public abstract String addTopping();
}
