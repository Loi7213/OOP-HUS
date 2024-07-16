package lab10.singleton.example;

public class Main {
    public static void main(String[] args) {
        SingletonExample singleton1 = SingletonExample.getInstance();
        singleton1.showMessage();

        SingletonExample singleton2 = SingletonExample.getInstance();
        singleton2.showMessage();

        System.out.println("Are singleton1 and singleton2 the same instance? " + (singleton1 == singleton2));
    }
}
