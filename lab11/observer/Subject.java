package lab11.observer;

public interface Subject {
    void attach(Observer observer);
    int getState();
    void notifyAllObservers();
}
