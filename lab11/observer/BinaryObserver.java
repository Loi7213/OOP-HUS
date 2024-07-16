package lab11.observer;

public class BinaryObserver implements Observer {
    private Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary: " + Integer.toBinaryString(subject.getState()));
    }
}
