package Notification.Observer;

import Notification.Observable.BackInStockObservable;

public class EmailNotificationObserver implements NotificationObserver {
    String emailId;
    BackInStockObservable backInStockObservable;

    public EmailNotificationObserver(String emailId,BackInStockObservable backInStockObservable)
    {
        this.emailId=emailId;
        this.backInStockObservable=backInStockObservable;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is now available");
    }

    private void sendMail(String emailId, String message) {
        System.out.println(message+ "has been sent to" +emailId);
    }
}
