package Notification.Observable;

import Notification.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneBackInStockObservable implements BackInStockObservable{
    List<NotificationObserver> notificationObservers;
    int stock;

    public  IphoneBackInStockObservable(int stock)
    {
        this.stock=stock;
        notificationObservers=new ArrayList<>();
    }
    @Override
    public void add(NotificationObserver observer) {
        notificationObservers.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        notificationObservers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver notificationObserver:notificationObservers)
        {
            notificationObserver.update();
        }
    }
    @Override
    public void setStock(int newStock)
    {
        if(stock==0 && newStock>0)
        {
            notifySubscribers();
        }
        stock=newStock+stock;
    }
}
