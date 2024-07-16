package lab11.decorator.icecream;

public class IceCreamDecorator {
    public static void main(String[] args) {
        IceCream vanillaIceCream = new VanillaIceCream();
        IceCream strawberryIceCreamWithHoneyTopping = new HoneyToppingDecorator(new StrawberryIceCream());
        IceCream chocolateIceCreamWithNutsTopping = new NutsToppingDecorator(new ChocolateIceCream());

        System.out.println(vanillaIceCream.getDescription());
        System.out.println(strawberryIceCreamWithHoneyTopping.getDescription());
        System.out.println(chocolateIceCreamWithNutsTopping.getDescription());
    }
}
