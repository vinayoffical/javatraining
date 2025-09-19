package javabasic;
// Written in 2008
public interface Notification {
    String notificationType = "Notification";//public static and final
    void sendNotification();// public and abstract
    default void retryMechanism(){

    }
    static void testStatic(){

    }
}
