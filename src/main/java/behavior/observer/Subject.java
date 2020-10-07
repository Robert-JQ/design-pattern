package behavior.observer;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyAllObservers(String s);
}
