class g {
    static int staticCount = 0;
    int instanceCount = 0;

    public void incrementAndPrint() {
        staticCount++;
        instanceCount++;
        System.out.println("Static: " + staticCount + " | Instance: " + instanceCount);
    }
}

public class Main {
    public static void main(String[] args) {
        g obj1 = new g();
        g obj2 = new g();
        g obj3 = new g();

        System.out.println("Object 1:");
        obj1.incrementAndPrint();

        System.out.println("Object 2:");
        obj2.incrementAndPrint();

        System.out.println("Object 3:");
        obj3.incrementAndPrint();
    }
}