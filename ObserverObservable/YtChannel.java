package ObserverObservable;
import java.util.ArrayList;
import java.util.List;

public class YtChannel implements IObservable {
    private List <IObserver> subscribers = new ArrayList<IObserver>();
    String name;
    String latestVideo;

    YtChannel(String name) {
        this.name = name;
    }

    @Override
    public void add(IObserver sub) {
        this.subscribers.add(sub);
    }

    @Override
    public void remove(IObserver sub) {
        this.subscribers.remove(0);
    }

    @Override
    public boolean uploadVideo(String videoTitle) {
        this.latestVideo = videoTitle;
        System.out.println("video uploaded with title :>> "+ videoTitle);

        return true;
    }
 
    @Override
    public void notifyAllSubs() {
        System.out.println("notified all subs >>>");

        for (IObserver sub : subscribers) {
            sub.update();
        }
    }

    public String getLatestVideo() {
        return latestVideo;
    }
}