import java.util.ArrayList;
import java.util.List;

class GenericStack<T> {
    private List<T> stackList = new ArrayList<>();

    public void push(T item) {
        stackList.add(item);
        System.out.println("Pushed: " + item);
    }

    public T pop() {
        if (stackList.isEmpty()) {
            System.out.println("Stack Underflow!");
            return null;
        }
        return stackList.remove(stackList.size() - 1);
    }

    public void display() {
        System.out.println("Current Stack (Bottom to Top): " + stackList);
    }
}

public class GenericStackTest {
    public static void main(String[] args) {
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Java");
        stringStack.push("Python");
        stringStack.display();
        
        System.out.println("Popped: " + stringStack.pop());
        stringStack.display();
    }
}