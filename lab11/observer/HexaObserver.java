package lab11.observer;

public class HexaObserver implements Observer {
    private Subject subject;

    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}