import java.util.ArrayList;
public class YoutubeData implements Subject {
    private ArrayList observers;
    private int pewdsSubscribers = 80000000;
    private int tseriesSubscribers = 80000000;

    public YoutubeData(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(int i = 0; i<observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(pewdsSubscribers, tseriesSubscribers);
        }
    }

    public void subscribersChanged()
    {
        notifyObservers();
    }

    public void subscribe(){
        pewdsSubscribers++;
        tseriesSubscribers--;
        subscribersChanged();
    }
}
