package javabasic;

public class NotificationDemo {
    public static void main(String...a){
        SmsNotification smsNotification = new SmsNotification();//
        Notification notification = new SmsNotification();// Object is of smsNotification
        notification = new EmailNotification();
        callSendNotification(notification);
    }
    //This is common
    private static void callSendNotification(Notification smsNotification) {

    }

}
