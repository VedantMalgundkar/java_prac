package ObserverObservable;

public class ObserverObservable {
    public static void main(String[] args) {
        YtChannel channel = new YtChannel("Gaming Channel");
        YtSubscriber sub1 = new YtSubscriber("Raju", channel);
        YtSubscriber sub2 = new YtSubscriber("Raj", channel);
        YtSubscriber sub3 = new YtSubscriber("Bablu", channel);
        
        channel.add(sub1);
        channel.add(sub2);
        channel.add(sub3);

        channel.remove(sub3);

        channel.uploadVideo("Pubg clutch 1V4");

        channel.notifyAllSubs();
    }
}