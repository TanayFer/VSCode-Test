abstract class Notification {
    abstract void sendMessage();
}

class EmailNotification extends Notification {
    @Override
    void sendMessage() {
        System.out.println("Sending email notification...");
    }
}

class SMSNotification extends Notification {
    @Override
    void sendMessage() {
        System.out.println("Sending SMS notification...");
    }
}