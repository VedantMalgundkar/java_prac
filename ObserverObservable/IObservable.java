package ObserverObservable;

interface IObservable {
    public void add(IObserver user);
    public void remove(IObserver user);
    public boolean uploadVideo(String videoTitle);
    public void notifyAllSubs();
}