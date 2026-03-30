abstract class Robot {
    abstract void performTask();
}

class CleaningRobot extends Robot {
    @Override
    void performTask() {
        System.out.println("Cleaning the floor...");
    }
}

class WeldingRobot extends Robot {
    @Override
    void performTask() {
        System.out.println("Welding the metal...");
    }
}