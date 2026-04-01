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

public class b {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        email.sendMessage();
        sms.sendMessage();
    }
}