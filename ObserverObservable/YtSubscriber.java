package ObserverObservable;

public class YtSubscriber implements IObserver {
    static int incrId = 0;
    private int id;
    private String name;
    private YtChannel channel;

    YtSubscriber(String name, YtChannel channel) {
        this.id = ++incrId;
        this.channel = channel;
    }

    @Override
    public void update() {
        String latestVideo = channel.getLatestVideo();
        System.out.println("latestVideo is >> "+latestVideo);
    }
}

