// Class A
class A {
    public void message() {
        System.out.println("Message from class A");
    }
}

// Class B extends A
class B extends A {
    @Override
    public void message() {
        System.out.println("Message from class B");
    }
}

// Class C extends B
class C extends B {
    @Override
    public void message() {
        System.out.println("Message from class C");
    }
    
    public void callSuperMessage() {
        super.message(); // Calls B's message()
    }
}

// Main class to test
public class f {
    public static void main(String[] args) {
        C obj = new C();
        obj.message();           // Output: Message from class C
        obj.callSuperMessage();  // Output: Message from class B
    }
}