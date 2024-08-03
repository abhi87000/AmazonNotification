package Notification.Observable;

import Notification.Observer.NotificationObserver;

public interface BackInStockObservable {
    public void add(NotificationObserver observer);
    public void remove(NotificationObserver observer);
    public void notifySubscribers();
    public void setStock(int stock);
}
