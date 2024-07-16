package lab11.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        System.out.println("Setting state to 15");
        subject.setState(15);
    }
}
