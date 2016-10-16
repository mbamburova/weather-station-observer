/**
 * Created by Michaela Bamburová on 16.10.2016.
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
