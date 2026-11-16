class Calculator<T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}

public class GenericCalculatorTest {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(20, 10);
        System.out.println("Addition: " + intCalc.add());
        System.out.println("Multiplication: " + intCalc.multiply());

        Calculator<Double> doubleCalc = new Calculator<>(5.5, 2.0);
        System.out.println("Division: " + doubleCalc.divide());
    }
}