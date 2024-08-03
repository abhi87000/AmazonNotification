
import Notification.Observable.BackInStockObservable;
import Notification.Observable.IphoneBackInStockObservable;
import Notification.Observer.EmailNotificationObserver;
import Notification.Observer.MobileNotificationObserver;
import Notification.Observer.NotificationObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BackInStockObservable backInStockObservable=new IphoneBackInStockObservable(0);

        NotificationObserver observer=new EmailNotificationObserver("abc@gmail.com",backInStockObservable);
        NotificationObserver observer1=new MobileNotificationObserver("1234567890",backInStockObservable);

        backInStockObservable.add(observer);
        backInStockObservable.add(observer1);
        backInStockObservable.setStock(5);
    }
}