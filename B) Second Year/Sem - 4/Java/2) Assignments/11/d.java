interface Alarm {
    void ring();
}

class FireAlarm implements Alarm {
    @Override
    public void ring() {
        System.out.println("Fire alarm ringing: WOOP WOOP WOOP");
    }
}

class DoorAlarm implements Alarm {
    @Override
    public void ring() {
        System.out.println("Door alarm ringing: BEEP BEEP BEEP");
    }
}

public class d {
    public static void main(String[] args) {
        Alarm fire = new FireAlarm();
        Alarm door = new DoorAlarm();

        fire.ring();
        door.ring();
    }
}