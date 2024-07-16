package lab10.singleton.example;

public class SingletonExample {
    private static SingletonExample instance;

    // Private constructor to prevent direct instantiation
    private SingletonExample() {
    }

    // Static method to get the instance of Singleton
    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    // Other methods of the Singleton class
    public void showMessage() {
        System.out.println("Hello, This is a Singleton Example!");
    }
}
