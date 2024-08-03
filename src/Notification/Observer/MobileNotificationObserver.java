package Notification.Observer;

import Notification.Observable.BackInStockObservable;

public class MobileNotificationObserver implements NotificationObserver{
    String mobileNo;
    BackInStockObservable backInStockObservable;

    public MobileNotificationObserver(String mobileNo, BackInStockObservable backInStockObservable) {
        this.mobileNo = mobileNo;
        this.backInStockObservable = backInStockObservable;
    }

    @Override
    public void update() {
        sendSms(mobileNo,"product is now available");
    }

    private void sendSms(String mobileNo, String message) {
        System.out.println(message+ "has been sent to" +mobileNo);
    }
}
